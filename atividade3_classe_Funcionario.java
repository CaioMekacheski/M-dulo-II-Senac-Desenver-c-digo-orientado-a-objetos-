//Atualizado 15/02/2023 23:53

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
    
    //Método
    public abstract float aplicaAumento(float percent, float valorBase);
    public abstract float calculaSalario();
    public abstract String exibeDados();
}
