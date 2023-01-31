//Atualizado 31/01/2023 10:47
package atividade1_2;

import java.util.Scanner;


public class Atividade1_2 
{

    public static void main(String[] args) 
    {
        //Objetos
        Scanner entrada = new Scanner(System.in);
        
        Quarto quartoA = new Quarto();
        Quarto quartoB = new Quarto();
        
        Hospede cliente1 = new Hospede();
        Hospede cliente2 = new Hospede();
        
        //Entradas
        System.out.println("\n\t\tReserva de Quartos:\n\n");
        //Hospede 1
        System.out.println("Nome do hospede 1: ");
        cliente1.setNome(entrada.nextLine());
        System.out.println("Idade do hospede 1: ");
        cliente1.setIdade(entrada.nextInt());
        //Limpa o buffer após a entreda do valor inteiro
        clearBuffer(entrada);
        //Hospede 2 
        System.out.println("Nome do hospede 2: ");
        cliente2.setNome(entrada.nextLine());
        System.out.println("Idade do hospede 2: ");
        cliente2.setIdade(entrada.nextInt());
        clearBuffer(entrada);
        //Quarto A recebe o hospede 1
        quartoA.setHospede(cliente1);
        //Se a idade do hospede 2 for maior que a idade do hospede 1
        //faz a troca de quartos
        if(cliente2.getIdade() > cliente1.getIdade())
        {
            quartoB.setHospede(cliente1);
            quartoA.setHospede(cliente2);
        }
        //Senão, o quarto B recebe o hospede 2
        else
        {
            quartoB.setHospede(cliente2);
        }
        // Checa se há desconto
        String descontoA = quartoA.checaDesconto(quartoA.getHospede().getIdade());
        String descontoB = quartoB.checaDesconto(quartoB.getHospede().getIdade());
        //Saída
        System.out.println("\nQuarto A:");
        System.out.println("Hospede: " + quartoA.getHospede().getNome()+ descontoA);
        
        System.out.println("\nQuarto B:");
        System.out.println("Hospede: " + quartoB.getHospede().getNome()+ descontoB);
    }
    
    //Função para limpar o buffer
    private static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }
    
}
