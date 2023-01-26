

package atividade1_1;

import java.util.Scanner;



public class Atividade1_1 {

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        Auditorio alpha = new Auditorio();
        Auditorio beta = new Auditorio();
        
        alpha.nome = "Alpha";
        alpha.capacidade = 150;
        alpha.capacidadeExtra = 70;
        
        beta.nome = "Beta";
        beta.capacidade = 350;
        beta.capacidadeExtra = 0;
        
        System.out.println("\n\t\tReserva de Auditório");
        System.out.println("\nDigite o número de pessoas: ");
        int numPessoas = entrada.nextInt();
        
        if(numPessoas <= alpha.calculaCapacidade())
        {
            alpha.exibeCapacidade(alpha.calculaCapacidade(), numPessoas);
        }
        
        else if(numPessoas > alpha.calculaCapacidade() && numPessoas <= beta.calculaCapacidade())
        {
            beta.exibeCapacidade(beta.calculaCapacidade(), numPessoas);
        }
        

    }
    
}
