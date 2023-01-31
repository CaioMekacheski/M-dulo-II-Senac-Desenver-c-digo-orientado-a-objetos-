
package atividade1_3;

import atividade1_2.Hospede;
import java.util.Scanner;


public class Atividade1_3 
{

    public static void main(String[] args) 
    {
       
        Hospede[] hospede = new Hospede[20];
        String nome = "";
        int idade;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\n\t\tReservas dos Quartos: ");
        System.out.println("Valor padrão da reserva : R$");
        
        float diariaPadrao = entrada.nextFloat();
        float totalDiaria = 0;
        int gratuidade = 0;
        int meia = 0;
       
        for (int i = 0; i < hospede.length; i++)
        {
            clearBuffer(entrada);
            System.out.println("Nome do hospede: ");
            nome = entrada.nextLine();
                
            if(!"pare".equals(nome))
            {
                hospede[i] = new Hospede();
                hospede[i].setNome(nome);
                System.out.println("Idade do hospede: ");
                idade = entrada.nextInt();
                hospede[i].setIdade(idade);
                    
                if(hospede[i].getIdadeHospede() <= 4)
                {
                    gratuidade++;
                    System.out.println( hospede[i].getNomeHospede() + " possui gratuidade. ");
                }
              
                else if(hospede[i].getIdadeHospede() >= 80)
                {
                    meia++;
                    totalDiaria += diariaPadrao / 2;
                    System.out.println(hospede[i].getNomeHospede() + " paga meia. ");
                 }
              
                 else
                 {
                    totalDiaria += diariaPadrao;
                 }
              
              }
              else
              {
                  System.out.println("Total de Hospedagens: " + totalDiaria);
                  System.out.println( gratuidade + " gratuidade(s) " + meia + " meia(s).");
                  System.out.println("Fim");
                  break;
              }
                
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
