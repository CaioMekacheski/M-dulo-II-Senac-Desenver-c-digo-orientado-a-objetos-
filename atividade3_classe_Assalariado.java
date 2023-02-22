//Atualizado 22/02/20:03
package atividade3;

public class Assalariado extends Funcionario 
{
    //Atributos
    public float salarioBase;
    public int diasTrabalhados;
    
    //Construtor
    public Assalariado(String nome, String cpf, String endereco, 
            String fone, String setor, float salarioBase, int diasTrabalhados)
    {
        super(nome, cpf, endereco, fone, setor);
        this.salarioBase = salarioBase;
        this.diasTrabalhados = diasTrabalhados;
    };
    
    //Métodos
    @Override
    public float calculaSalario()
    {
        return diasTrabalhados * (salarioBase / 30);
    }
    
    @Override
    public float aplicaAumento(float percentAumento)
    {
        return this.salarioBase += percentAumento * (salarioBase / 100);
    }
    
    @Override
    public String exibeInfo()
    {
        return super.exibeDados() + "\nDias trabalhados: " + diasTrabalhados
                + "\nSalário base: R$ " + salarioBase + "\nTotal a receber: R$ " + calculaSalario();
    }
}
