//Atualizado 31/01/2023 00:45
package atividade1_2;

import java.util.Scanner;


public class Atividade1_2 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        Quarto quartoA = new Quarto();
        Quarto quartoB = new Quarto();
        
        Hospede cliente1 = new Hospede();
        Hospede cliente2 = new Hospede();
        
        System.out.println("\n\t\tReserva de Quartos:\n\n");
        System.out.println("Nome do hospede 1: ");
        cliente1.nome = entrada.nextLine();
        System.out.println("Idade do hospede 1: ");
        cliente1.idade = entrada.nextInt();
        
        clearBuffer(entrada);
        
        System.out.println("Nome do hospede 2: ");
        cliente2.nome = entrada.nextLine();
        System.out.println("Idade do hospede 2: ");
        cliente2.idade = entrada.nextInt();
        
        quartoA.hospede = cliente1;
        
        if(cliente2.getIdadeHospede()> cliente1.getIdadeHospede())
        {
            quartoB.hospede = cliente1;
            quartoA.hospede = cliente2;
        }
        else
        {
            quartoB.hospede = cliente2;
        }
        
        String descontoA = quartoA.checaDesconto(quartoA.hospede.getIdadeHospede());
        String descontoB = quartoB.checaDesconto(quartoB.hospede.getIdadeHospede());
        
        System.out.println("\nQuarto A:");
        System.out.println("Hospede: " + quartoA.hospede.getNomeHospede()+ descontoA);
        
        System.out.println("\nQuarto B:");
        System.out.println("Hospede: " + quartoB.hospede.getNomeHospede() + descontoB);
    }
    
    
    private static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }
    
}
