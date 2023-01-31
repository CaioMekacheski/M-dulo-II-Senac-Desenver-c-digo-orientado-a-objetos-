
package atividade1_4;

import java.util.Scanner;
import atividade1_2.*;


public class Atividade1_4 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        int numQuartos = 15;
        Quarto[] quarto = new Quarto[numQuartos];
        Hospede[] hospede = new Hospede[numQuartos];
        
        for(int j = 0; j < numQuartos; j++)
        {
            quarto[j] = new Quarto(j+1);
            quarto[j].setHospede(null);
        }
        
        int opcao;
        
        do
        {
            System.out.println(" Digite (1) para novo cadastro (2) para pesquisar (3) para sair");
            opcao = entrada.nextInt();
            clearBuffer(entrada);
        
            switch(opcao)
            {
                case 1:
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
                    continue;
                
                case 2:
                    System.out.println("\t\tPESQUISA DE HÓSPEDES");
                    String pesquisa = entrada.nextLine();
                    boolean encontrado = false;
                
                    for(int k = 0; k <= numQuartos; k++)
                    {
                        String nomeHospede = quarto[k].getHospede().getNome();
                        
                        if(nomeHospede != null)
                        {
                            if(pesquisa.equals(nomeHospede))
                            {
                                encontrado = true;
                                System.out.println("O hóspede " + pesquisa +
                                    " esta hospedado no quarto " + quarto[k].getId());
                            }
                        }
                        
                        
                    }
                    
                    if(encontrado == false)
                    {
                        System.out.println("Não encontrado.");
                    }
                    
                    
                case 3:
                    break;
                    
                default:
                    break;
        }
        
                
        }while(opcao != 3);
    }
    
    private static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }
    
}
