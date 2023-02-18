//Criado 17/02/2023 22:47
package atividade3;

import java.util.Scanner;

public class Atividade3 
{

    public static void main(String[] args) 
    {
        int numFunc = 10;
        
        Scanner entrada = new Scanner(System.in);
        Funcionario[] funcionario = new Funcionario[numFunc];
        
        for(int i = 0; i < numFunc; i++)
        {
            funcionario[i] = new Assalariado("caio", "33336699966", "Rua 4", 
                    "13998000118", "Vendas", 1500, 30);
        }
        
        for(int j = 0; j < numFunc; j++)
        {
            funcionario[j].calculaSalario();
            escreva(funcionario[j].exibeDados(), 1);
        }
    }
    
    private static void escreva(String texto, int modo)
    {
        switch(modo)
        {
            case 1:
                System.out.println(texto);    
                break;
            
            case 2:
                System.out.print(texto);
                break;
         
            default:
                System.out.println("Opção inválida");
                break;
        }     
    }
    
}
