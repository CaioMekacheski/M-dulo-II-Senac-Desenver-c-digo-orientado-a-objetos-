//Criado 04/02/2023 21:08
package atividade2;

public class Hospedagem 
{
    //Atributos
    private String descr;
    private float valorDiaria;
    
    //Construtor
    public Hospedagem(String descr, float valor)
    {
        this.descr = descr;
        this.valorDiaria = valor;
    }
    
    //Setters
    public void setDescr(String descr)
    {
        this.descr = descr;
    }
    
    public void setValor(float valor)
    {
        this.valorDiaria = valor;
    }
    
    //Getters
    public String getTipo()
    {
        return descr;
    }
    
    public float getValor()
    {
        return valorDiaria;
    }
}
