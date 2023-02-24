//Criado 24/02/2023 17:08
package atividade4;

public class Pis implements Imposto
{
    //Atributos
    public String nome = "PIS";
    public float valorImposto;
    public float valorBase;
    public float aliquota;
    
    //Construtor
    public Pis(float aliquota)
    {
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
    
    public void setAliquota(float aliquota)
    {
        this.aliquota = aliquota;
    }
    
    //Métodos
    public float calculaBase(float debito, float credito)
    {
        return valorBase = debito - credito;
    }
    
    @Override
    public float calculaImposto()
    {
       return valorImposto =  aliquota * (valorBase / 100);
    }
   
    @Override
    public String exibeDados()
    {
        return "\nPIS (Programa de Integração Social)" + 
               "\nValor base (débito - crédito): R$ " + valorBase +
               "\nValor da aliquota: " + aliquota + "%" +
               "\nValor do imposto: R$ " + valorImposto;
    }
}
