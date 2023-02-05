//Criado 04/02/2023 21:05
package atividade2;

public class PacoteDeViagem 
{
    //Atributos
    private String destino;
    private int dias;
    private Hospedagem hospedagem;
    private Transporte transporte;
    
    //Construtor
    public PacoteDeViagem(String destino, int dias, Hospedagem hospedagem, Transporte transporte)
    {
        this.destino = destino;
        this.dias = dias;
        this.hospedagem = hospedagem;
        this.transporte = transporte;
    }
    
    //Setters
    public void setDestino(String destino)
    {
        this.destino = destino;
    }
    
    public void setDias(int dias)
    {
        this.dias = dias;
    }
    
    public void setHospedagem(Hospedagem hospedagem)
    {
        this.hospedagem = hospedagem;
    }
    
    public void setTransporte(Transporte transporte)
    {
        this.transporte = transporte;
    }
    
    //Getters
    public String getDestino()
    {
        return destino;
    }
    
    public int getDia()
    {
        return dias;
    }
    
    public Hospedagem getHospedagem()
    {
        return hospedagem;
    }
    
    public Transporte getTransporte()
    {
        return transporte;
    }
    
    //Métodos
    public float calculaHospedagem(int dias)
    {
        return (hospedagem.getValor() * dias);
    }
    
    public float calculaLucro(float percent, float valor)
    {
        return valor + (percent * (valor / 100));
    }
    
    public float calculaPacote(float hospedagem, float transporte, float lucro, float adicional)
    {
        return hospedagem + transporte + lucro + adicional;
    }
    
}
