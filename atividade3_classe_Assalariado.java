//Criado 15/02/19:28
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
    
    //Método
    public float calculaSalario()
    {
        return diasTrabalhados * (salarioBase / 30);
    }
}
