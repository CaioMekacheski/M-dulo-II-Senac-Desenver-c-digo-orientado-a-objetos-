//Criado 24/02/2023 17:37

package atividade4;

public class Ipi implements Imposto
{
    public String nome = "IPI";
    public float valorBase;
    public float valorImposto;
    public float aliquota;
    
    public float calculaBase(float valorProd, float frete, float seguro, float outrasDesp)
    {
        return valorBase = valorProd + frete + seguro + outrasDesp;
    }
    
    @Override
    public float calculaImposto()
    {
        return valorImposto = aliquota * (valorBase / 100);
    }
    
    @Override
    public String exibeDados()
    {
        return "\nIPI (Imposto sobre Produtos Industrializados)" +
               "\nValor base (valor do produto + frete + seguro + outras despesas: R$ " + valorBase +
               "\nValor da aliquota: " + aliquota + "%" +
               "\nValor do imposto: R$ " + valorImposto;
    }
}
