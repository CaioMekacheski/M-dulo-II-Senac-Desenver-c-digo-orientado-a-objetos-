
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
        
        if(cliente2.idadeHospede() > cliente1.idadeHospede())
        {
            quartoB.hospede = cliente1;
            quartoA.hospede = cliente2;
        }
        else
        {
            quartoB.hospede = cliente2;
        }
        
        String descontoA = quartoA.checaDesconto(quartoA.hospede.idadeHospede());
        String descontoB = quartoB.checaDesconto(quartoB.hospede.idadeHospede());
        
        System.out.println("\nQuarto A:");
        System.out.println("Hospede: " + quartoA.hospede.nomeHospede() + descontoA);
        
        System.out.println("\nQuarto B:");
        System.out.println("Hospede: " + quartoB.hospede.nomeHospede() + descontoB);
    }
    
    
    private static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }
    
}
