//Atualizado 25/02/2023 17:58

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade4 
{

    public static void main(String[] args) 
    {
        //Variáveis
        String nome;
        String tipoImposto;
        float aliquota;
        float debito;
        float credito;
        float valor;
        float frete;
        float seguro;
        float outrasDesp;
        float baseCalculo;
        
        //Objetos
        Scanner entrada = new Scanner(System.in);
        Pagamentos pagamento;
        Imposto pis;
        Imposto ipi;
        ArrayList<Imposto> listImpostos;
        
        escreva("\t\tCADASTRO DE PAGAMENTOS", 1);
        escreva("\nNome da empresa: ", 2);
            nome = entrada.nextLine();
            
            listImpostos = new ArrayList<>();
            
            pagamento = new Pagamentos(nome, listImpostos);
        
        do
        {
            escreva("\nTipo de imposto (PIS ou IPI)", 2);
            tipoImposto = entrada.nextLine();
            
            switch(tipoImposto)
            {
                case "PIS":
                    escreva("\nCalculo do PIS: ", 1);
             
                    escreva("Aliquota: (%) ", 2);
                    aliquota = entrada.nextFloat();
                    clearBuffer(entrada);
                    
                    escreva("Débito: R$ ", 2);
                    debito = entrada.nextFloat();
                    clearBuffer(entrada);
                    
                    escreva("Crédito: R$ ", 2);
                    credito = entrada.nextFloat();
                    clearBuffer(entrada);
                    
                    pis = new Imposto("PIS", aliquota);
                    pis.calculaValorBasePis(debito, credito);
                    pis.calculaImposto();
                    listImpostos.add(pis);
                    break;
                    
                case "IPI":
                    escreva("\nCalculo do IPI: ", 1);
                    
                    escreva("\nAliquota: (%) ", 2);
                    aliquota = entrada.nextFloat();
                    clearBuffer(entrada);
                    
                    escreva("Valor do produto: R$ ", 2);
                    valor = entrada.nextFloat();
                    clearBuffer(entrada);
                    
                    escreva("\nFrete: R$ ", 2);
                    frete = entrada.nextFloat();
                    clearBuffer(entrada);
                    
                    escreva("\nSeguro: R$ ", 2);
                    seguro = entrada.nextFloat();
                    clearBuffer(entrada);
                    
                    escreva("\nOutras despesas: R$ ", 2);
                    outrasDesp = entrada.nextFloat();
                    clearBuffer(entrada);
                    
                    ipi = new Imposto("IPI", aliquota);
                    ipi.calculaValorBaseIpi(valor, frete, seguro, outrasDesp);
                    ipi.calculaImposto();
                    listImpostos.add(ipi);
                    break;
                    
                default:
                    escreva("\nImposto não cadastrado.", 1);
                    break;
            }
        }
        while(!tipoImposto.equals("pare"));
        
        
        for(int i = 0; i < pagamento.listImpostos.size(); i++)
        {
            escreva(pagamento.listImpostos.get(i).exibeDados(), 1);
        }
        
         
    }
    
    // Função para escrever
    // Modo 1 adiciona quebra de linha
    // Modo 2 não adiciona quebra de linha
    private static void escreva(String texto, int modo)
    {
        switch(modo)
        {
            case 1:
                System.out.println(texto);    
                break;
            
            case 2:
                System.out.print(texto);
                break;
         
            default:
                System.out.println("Opção inválida");
                break;
        }     
    }
    
    //Função para limpar o buffer
    private static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }
    
}
