//Atualizado 15/02/23:53
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
    public float aplicaAumento(float salarioBase, float percentAumento)
    {
        return this.salarioBase += percentAumento * (salarioBase / 100);
    }
    
    @Override
    public String exibeDados()
    {
        return "Nome: " + nome + "\n CPF: " + cpf + "\n Endereço: " + 
                endereco + "\nTelefone: " + fone + "\nSetor: " + setor + "Dias trabalhados: " + diasTrabalhados
                + "\nSalário base: R$ " + salarioBase + "\nTotal a receber: R$ " + calculaSalario();
    }
}
