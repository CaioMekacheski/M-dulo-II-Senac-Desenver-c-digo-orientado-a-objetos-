//Criado 25/02/2023 18:04

package atividade4;

import java.util.ArrayList;

public class Pagamentos
{
    //Atributos
    public String nomeEmpresa;
    public ArrayList<Imposto> listImpostos;
    
    //Construtor
    public Pagamentos(String nomeEmpresa, ArrayList<Imposto> impostos)
    {
        this.nomeEmpresa = nomeEmpresa;
        this.listImpostos = impostos;
    }
}
