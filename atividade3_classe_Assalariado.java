//Atualizado 22/02/2023 21:46
package atividade3;

public class Assalariado extends Funcionario 
{
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
        String strSalarioBase = formato.format(salarioBase);
        String strCalculaSalario = formato.format(calculaSalario());
        return super.exibeDados() + "\nDias trabalhados: " + diasTrabalhados
                + "\nSalário base: R$ " + strSalarioBase + "\nTotal a receber: R$ " + strCalculaSalario;
    }
}
