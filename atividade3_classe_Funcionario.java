//Atualizado 22/02/2023 19:29

package atividade3;

public abstract class Funcionario 
{
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
        return "Nome: " + nome + "\n CPF: " + cpf + "\n Endereço: " + 
                endereco + "\nTelefone: " + fone + "\nSetor: " + setor;
    }
    
    //Métodos abstratos
    public abstract float aplicaAumento(float percent, float valorBase);
    public abstract float calculaSalario();
    
}
