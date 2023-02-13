//Atualizado 13/02/2023 01:25
package atividade2;


public class Venda 
{
    //Atributos
    private String cliente;
    private String pagamento;
    private PacoteDeViagem pacote;
    
    //Construtor
    public Venda(String cliente, String pagamento, PacoteDeViagem pacote)
    {
        this.cliente = cliente;
        this.pagamento = pagamento;
        this.pacote = pacote;
    }
    
    //Setters
    public void setCliente(String cliente)
    {
        this.cliente = cliente;
    }
    
    public void setPagamento(String pagamento)
    {
        this.pagamento = pagamento;
    }
    
    public void setPacote(PacoteDeViagem pacote)
    {
        this.pacote = pacote;
    }
    
    //Getters
    public String getCliente()
    {
        return cliente;
    }
    
    public String getPagamento()
    {
        return pagamento;
    }
    
    public PacoteDeViagem getPacote()
    {
        return pacote;
    }
    
    //Métodos
    public float convertRealUSD(float real, float usd)
    {
        return real / usd;
    }
    
    public String exibeTotais(String real, String usd)
    {
        return "Total em reais: R$ " + real + "\n Total em Dólares: US$ " + usd;
    }
            
    
}
