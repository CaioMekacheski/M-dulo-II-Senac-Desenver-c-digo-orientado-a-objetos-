//Atualizado 02/02/2023 19:36
package atividade1_4;

import java.util.Scanner;
import atividade1_2.*;

public class Atividade1_4 
{

    public static void main(String[] args) 
    {
        //Variáveis
        int i = 0;
        int numQuartos = 15;
        String opcao;
        //Objetos
        Scanner entrada = new Scanner(System.in);
        Quarto[] quarto = new Quarto[numQuartos];
        Hospede[] hospede = new Hospede[numQuartos];
        //Preenchimento dos vetores hospede e quarto
        for(int l = 0; l < numQuartos; l++)
        {
            hospede[l] = new Hospede();
            hospede[l].setNome(" ");
            
            quarto[l] = new Quarto(l+1);
            quarto[l].setHospede(hospede[l]);
        }
        
        do 
        {
            //Entrada
            System.out.println(" Digite (1) para novo cadastro (2) para pesquisar (3) para sair");
            opcao = entrada.nextLine();

            switch (opcao) 
            {
                //Se a opção for 1, realiza um novo cadastro se ouver vagas
                case "1":
                    if (i < numQuartos) 
                    {
                        System.out.println("\t\tCADASTRO DE HÓSPEDES");
                        hospede[i] = new Hospede();
                        System.out.println("Nome do hospede: ");
                        String nome = entrada.nextLine();
                        hospede[i].setNome(nome);

                        System.out.println("Idade do hospede: ");
                        int idade = entrada.nextInt();
                        hospede[i].setIdade(idade);
                        clearBuffer(entrada);

                        quarto[i].setHospede(hospede[i]);
                        i++;
                        
                    } 
                    else 
                    {
                        System.out.println("Não há mais vagas");
                    }
                    break;
                //Se for 2, realiza a pequisa pelo nome digitado
                case "2":
                    System.out.println("\t\tPESQUISA DE HÓSPEDES");
                    String pesquisa = entrada.nextLine();
                    String nomeHospede[] = new String[numQuartos];
                    boolean encontrado = false;

                    for (int k = 0; k < numQuartos; k++) 
                    {
                        nomeHospede[k] = quarto[k].getHospede().getNome();

                        if (pesquisa.equals(nomeHospede[k])) 
                        {
                            encontrado = true;
                            System.out.println("O hóspede " + pesquisa
                                    + " esta hospedado no quarto " + quarto[k].getId());
                        }     
                    }

                    if (encontrado == false) 
                    {
                        System.out.println("Não encontrado.");
                    }
                    break;
                //Caso seja 3, encerra o programa
                case "3":
                    System.out.println("Encerrando...");
                    break;
                //Caso outro valor seja digitado, exibe uma mensagem de erro
                default:
                    System.out.println("valor inválido.");
                    break;
            }

        } 
        while (!"3".equals(opcao));
    }

    private static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }

}
