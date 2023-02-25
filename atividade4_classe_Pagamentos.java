//Criado 25/02/2023 00:53

package atividade4;

public class Pagamentos
{
    //Atributos
    public String nomeEmpresa;
    public Imposto[] impostos;
    
    //Construtor
    public Pagamentos(String nomeEmpresa, Imposto[] impostos)
    {
        this.nomeEmpresa = nomeEmpresa;
        this.impostos = impostos;
    }
}
