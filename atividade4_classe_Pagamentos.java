//Criado 26/02/2023 16:19

package atividade4;

import static atividade4.Atividade4.escreva;
import static atividade4.Atividade4.isFloat;
import java.util.ArrayList;
import java.util.Scanner;

public class Pagamentos
{
    //Atributos
    public Scanner entrada = new Scanner(System.in);
    private String nomeEmpresa;
    private ArrayList<Imposto> listImpostos;
    
    //Construtor
    public Pagamentos(String nomeEmpresa, ArrayList<Imposto> impostos)
    {
        this.nomeEmpresa = nomeEmpresa;
        this.listImpostos = impostos;
    }
    
    //Getters and Setters
    public String getNomeEmpresa()
    {
        return this.nomeEmpresa;
    }
    
    public ArrayList<Imposto> getlistImpostos()
    {
        return this.listImpostos;
    }
    
    public void setNomeEmpresa(String nomeEmpresa)
    {
        this.nomeEmpresa = nomeEmpresa;
    }
    
    public void setListImpostos(ArrayList<Imposto> impostos)
    {
        this.listImpostos = impostos;
    }
    
    //Metodos
    public float entradaValor(String descr)
    {
        float valor;
        char chValor;
        String strValor;
        String caracterValor = "";
        do
        {
            //Entrada
            escreva(descr, 2);
            strValor = entrada.nextLine();
            
            //Verifica se o valor digitado é float
            for(int i = 0; i < strValor.length(); i++)
            {
                chValor = strValor.charAt(i);
                caracterValor = Character.toString(chValor);

                if(isFloat(caracterValor) != true)
                {
                    escreva("Valor inválido. Digite um valor numérico.", 1);
                    break;
                }
            }
        }
        while(isFloat(caracterValor) != true);
        
        //Converte o valor digitado em float
        valor = Float.parseFloat(strValor);
        
        return valor;
    }
    
    public void listPagamentos()
    {
        escreva("\nLISTA DE PAGAMENTOS", 1);
        escreva("Empresa: " + nomeEmpresa, 1);
        
        for(int i = 0; i < listImpostos.size(); i++)
        {
            escreva(listImpostos.get(i).exibeDados(), 1);
        }
    }
}
