//Criado 04/02/2023 21:04
package atividade2;

public class Transporte 
{
    private String tipo;
    private float valor;
    
    //Construtor
    public Transporte(String tipo, float valor)
    {
        this.tipo = tipo;
        this.valor = valor;
    }
    
    //Setters
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public void setValor(float valor)
    {
        this.valor = valor;
    }
    
    //Getters
    public String getTipo()
    {
        return tipo;
    }
    
    public float getValor()
    {
        return valor;
    }
}
