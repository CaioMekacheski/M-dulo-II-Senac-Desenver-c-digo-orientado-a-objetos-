// Atualizado 22/02/2023 20:04
package atividade3;

public class Horista extends Funcionario 
{
    //Atributos
    public float valorHora;
    public float horasTrabalhadas;
    
    //Construtor
    public Horista(String nome, String cpf, String endereco, 
            String fone, String setor, float valorHora, float horasTrabalhadas)
    {
        super(nome, cpf, endereco, fone, setor);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    //Métodos
    @Override
    public float calculaSalario()
    {
        return valorHora * horasTrabalhadas;
    }
    
    @Override
    public float aplicaAumento(float percent)
    {
        return this.valorHora += percent * (valorHora / 100);
    }
    
    @Override
    public String exibeInfo()
    {
        return super.exibeDados() + "Horas trabalhadas: " + horasTrabalhadas
                + "\nValor hora: R$ " + valorHora + "\nTotal a receber: R$ " + calculaSalario();
    }
}
