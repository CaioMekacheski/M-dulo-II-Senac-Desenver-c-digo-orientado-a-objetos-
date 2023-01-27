
package atividade1_1;


public class Auditorio 
{
    String nome;
    int capacidade;
    int capacidadeExtra;
    
    public int calculaCapacidade()
    {
        return capacidade + capacidadeExtra;           
    }
    
    public int calculaCapacidadeExtra(int numPessoas)
    {
        return numPessoas - capacidade;
    }
    
    public void exibeCapacidade(int capacidadeTotal, int numPessoas)
    {
        System.out.println("\n Utilize o auditório " + nome);
            
        if(capacidadeExtra > 0 && numPessoas > capacidade)
        {
            int lugaresExtras = calculaCapacidadeExtra(numPessoas);
            System.out.println("\nInclua mais " + lugaresExtras);
        }
    }        
    
}
