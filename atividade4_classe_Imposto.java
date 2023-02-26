//Criado 26/02/2023 17:00
package atividade4;

import static atividade4.Atividade4.formato;

public class Imposto implements interfaceImposto
{
    //Atributos
    private String nome;
    private float valorBase;
    private float aliquota;
    private float valorImposto;
    
    //Construtor
    public Imposto(String nome, float aliquota)
    {
        this.nome = nome;
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
    public float calculaValorBasePis(float debito, float credito)
    {
        return valorBase = debito - credito;
    }
    
    public float calculaValorBaseIpi(float valor, float frete, float seguro, float outrasDesp)
    {
        return valorBase = valor + frete + seguro + outrasDesp; 
    }
    
    @Override
public float calculaImposto()
    {
        return valorImposto =  aliquota * (valorBase / 100);
    }
   
    @Override
    public String exibeDados()
    {
        String strValorBase = formato.format(valorBase);
        String strAliquota = formato.format(aliquota);
        String strValorImposto= formato.format(valorImposto);
        return "\n" + nome +
               "\nValor base : R$ " + strValorBase +
               "\nValor da aliquota: " + strAliquota + "%" +
               "\nValor do imposto: R$ " + strValorImposto;
    }
}
