//Atualizado 02/02/2023 19:27
package atividade1_3;

import atividade1_2.Hospede;
import java.util.Scanner;


public class Atividade1_3 
{

    public static void main(String[] args) 
    {
        //Variáveis
        int idade;
        int gratuidade = 0;
        int meia = 0;
        float totalDiaria = 0;
        String nome;
        //Objetos
        Hospede[] hospede = new Hospede[20];
        Scanner entrada = new Scanner(System.in);
        //Entrada
        System.out.println("\n\t\tReservas dos Quartos: ");
        System.out.println("Valor padrão da reserva : R$");
        
        float diariaPadrao = entrada.nextFloat();
            //Recebe novos cadastros enquanto a capacidade total não for atingida
            for (int i = 0; i < hospede.length; i++)
            {
                clearBuffer(entrada);
                System.out.println("Nome do hospede: ");
                nome = entrada.nextLine();
                //Enquanto não for inserido a plavra "pare" no lugar do nome, continua realizando os cadastros
                if(!"pare".equals(nome))
                {
                    hospede[i] = new Hospede();
                    hospede[i].setNome(nome);
                    System.out.println("Idade do hospede: ");
                    idade = entrada.nextInt();
                    hospede[i].setIdade(idade);
                    //Se a idade do hospede for menor ou igual a 4
                    if(hospede[i].getIdadeHospede() <= 4)
                    {
                        //Atualiza o contador de gratuidade e exibe a condição na tela
                        gratuidade++;
                        System.out.println( hospede[i].getNomeHospede() + " possui gratuidade. ");
                    }
                    //Se a idade for maio ou igual a 80
                    else if(hospede[i].getIdadeHospede() >= 80)
                    {
                        //Atualiza o contador de meias, soma o valor da diaria dividido por 2 ao total de diárias
                        //e exibe a condição na tela
                        meia++;
                        totalDiaria += diariaPadrao / 2;
                        System.out.println(hospede[i].getNomeHospede() + " paga meia. ");
                    }
                    else
                    {
                        //Senão soma o valor padrão ao total de diárias
                        totalDiaria += diariaPadrao;
                    }    
                }
                //Caso "pare" seja digitado, exibe os totais e encerra o programa
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
