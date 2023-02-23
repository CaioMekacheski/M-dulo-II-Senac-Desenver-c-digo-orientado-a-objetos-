//Atualizado 22/02/2023 21:44

package atividade3;

import java.text.DecimalFormat;

public abstract class Funcionario 
{
    DecimalFormat formato = new DecimalFormat("0.00");
    //Atributos
    public String nome;
    public String cpf;
    public String endereco;
    public String fone;
    public String setor;
    
    //Construtor
    public Funcionario(String nome, String cpf, String endereco, String fone, String setor)
    {
        this.nome = nome;   this.cpf = cpf;   this.endereco = endereco;   this.fone = fone;   this.setor = setor; 
    };
    
    //Getters
    public String getNome()
    {
        return nome;
    }
    
    public String getSetor()
    {
        return setor;
    }
    
    //Métodos
    public String exibeDados()
    {
        return "\nNome: " + nome + "\nCPF: " + cpf + "\nEndereço: " + 
                endereco + "\nTelefone: " + fone + "\nSetor: " + setor;
    }
    
    //Métodos abstratos
    public abstract float aplicaAumento(float percent);
    public abstract float calculaSalario();
    public abstract String exibeInfo();
    
}
