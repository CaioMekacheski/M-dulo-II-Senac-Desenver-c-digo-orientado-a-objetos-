//Criado 02/02/2023 19:08
package atividade1_5;

import atividade1_2.*;
import java.util.Scanner;


public class Atividade1_5 
{

    public static void main(String[] args) 
    {
        //Variáveis
        int andar;
        int numQuarto;
        int idHospede = 1;
        //Objetos
        String opcao = "s";
        Scanner entrada = new Scanner(System.in);
        Quarto[][] quarto = new Quarto[4][3];
        Hospede[] hospede = new Hospede[12];
        //Criação dos quartos
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                quarto[i][j] = new Quarto(j);
            }
        }
        //Entrada
        System.out.println("\t\tRESERVAR QUARTO");
        
        do
        {
            //Seleciona o andar e o número do quarto
            System.out.println("Informe o andar e o quarto:");
            andar = entrada.nextInt();
            clearBuffer(entrada);
            numQuarto = entrada.nextInt();
            clearBuffer(entrada);
            //Cria um novo hospede e o hospeda no quarto selecionado
            hospede[idHospede] = new Hospede();
            quarto[andar-1][numQuarto-1].setHospede(hospede[idHospede]);
            //Pergunta se deseja realizar outra reserva
            System.out.println("Deseja informar outra reserva? (S)im / (N)ão");
            opcao = entrada.nextLine();
            
            
        }
        while("s".equals(opcao));
        //Saída
        System.out.println("*********************************************************************");
        System.out.println("\t\t\tOCUPAÇÃO DO HOTEL");
        System.out.println("*********************************************************************");
        //Itera sobre os andares de forma regressiva
        for(int i = 3; i >= 0; i--)
        {
            System.out.println((i+1) + "º ANDAR:");
            //Itera sobre os quartos de forma progressiva
            for(int j = 0; j < 3; j++)
            {
                // Define o status invocando o metodo checaDisp() que retorna uma String
                String status = "Quarto " + (j+1) + ": " + quarto[i][j].checaDisp();
                
                //Se o quarto estiver ocupado, imprime o status seguido de (X)
                if("Ocupado.".equals(quarto[i][j].checaDisp()))
                {
                    System.out.print(status + " (X) ");
                }
                //Se estiver livre, imprime o status seguido de (O)
                else 
                {
                    System.out.print(status + "   (O) ");
                }
                
                
            }
            System.out.println();
            System.out.println("*********************************************************************");
        }
        
    }
    
    private static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }
    
}
