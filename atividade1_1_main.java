//Atualizado 31/01/2023 11:10
package atividade1_1;

import java.util.Scanner;


public class Atividade1_1 {

    public static void main(String[] args) 
    {
        //Objetos
        Scanner entrada = new Scanner(System.in);
        Auditorio alpha = new Auditorio("Alpha", 150, 70);
        Auditorio beta = new Auditorio("Beta", 350, 0);
        //Entrada
        System.out.println("\n\t\tReserva de Auditório");
        System.out.println("\nDigite o número de pessoas: ");
        int numPessoas = entrada.nextInt();
        //Se o número de pessoas for menor que a capacidade do auditorio Alpha
        //Seleciona, calcula e exibe as informações sobre o auditório selecionado
        if(numPessoas <= alpha.calculaCapacidade())
        {
            alpha.exibeCapacidade(alpha.calculaCapacidade(), numPessoas);
        }
        //Se o numero de pessoas for maior que a capacidade do auditório Alpha e 
        //o número de pessoas for menor que a capacidade do auditório Beta
        //Seleciona, calcula e exibe as informações sobre o auditório selecionado
        else if(numPessoas > alpha.calculaCapacidade() && numPessoas <= beta.calculaCapacidade())
        {
            beta.exibeCapacidade(beta.calculaCapacidade(), numPessoas);
        }
    }    
}
