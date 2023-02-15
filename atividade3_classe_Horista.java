// Criado 15/02/2023 19:39
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
    
    //Método
    public float calculaHoras()
    {
        return valorHora * horasTrabalhadas;
    }
}
