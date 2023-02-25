//Criado 25/02/2023 00:53
package atividade4;

public class Imposto implements interfaceImposto
{
    //Atributos
    public String nome;
    public float valorBase;
    public float aliquota;
    public float valorImposto;
    
    //Construtor
    public Imposto(String nome, float valorBase, float aliquota)
    {
        this.nome = nome;
        this.valorBase = valorBase;
        this.aliquota = aliquota;
    }
    
    //Getters e Setters
    public String getNome()
    {
        return this.nome;
    }
    
    public float getValorImposto()
    {
        return this.valorImposto;
    }
    
    public float getValorBase()
    {
        return this.valorBase;
    }
    
    public float getAliquota()
    {
        return this.aliquota;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setAliquota(float aliquota)
    {
        this.aliquota = aliquota;
    }
    
    //Métodos
    
    @Override
    public float calculaImposto()
    {
       return valorImposto =  aliquota * (valorBase / 100);
    }
   
    @Override
    public String exibeDados()
    {
        return "\n" + nome +
               "\nValor base : R$ " + valorBase +
               "\nValor da aliquota: " + aliquota + "%" +
               "\nValor do imposto: R$ " + valorImposto;
    }
}
