//Atualizado 26/02/2023 17:00

package atividade4;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade4 
{
    static DecimalFormat formato = new DecimalFormat("0.00");
    
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
        
        //Objetos
        Scanner entrada = new Scanner(System.in);
        Pagamentos pagamento;
        Imposto pis;
        Imposto ipi;
        ArrayList<Imposto> listImpostos;
        
        //Entrada
        escreva("\t\tCADASTRO DE PAGAMENTOS", 1);
        escreva("\nNome da empresa: ", 2);
        
        nome = entrada.nextLine();           
        listImpostos = new ArrayList<>();
        
        //Cria lista de pagamentos
        pagamento = new Pagamentos(nome, listImpostos);
        
        //Recebe os dados até que 'pare' seja digitado
        do
        {
            //Seleciona o tipo de imposto
            escreva("\nTipo de imposto (PIS ou IPI)\nDigite 'pare' para encerrar: ", 2);
            tipoImposto = entrada.nextLine();
            
            //Recebe os dados, verifica os dados, cria o objeto e calcula seus valores
            switch(tipoImposto)
            {
                //Processamento PIS
                case "PIS":
                    escreva("\nCalculo do PIS: ", 1);
                    //Recebe os dados
                    aliquota = pagamento.entradaValor("\nAliquota: (%) ");                   
                    debito = pagamento.entradaValor("Débito: R$ ");
                    credito = pagamento.entradaValor("Crédito: R$ ");
                    //Cria o objeto
                    pis = new Imposto("PIS (Programa de Integração Social)", aliquota);
                    //Calcula e formata os valores
                    String strValorBasePis = formato.format(pis.calculaValorBasePis(debito, credito));
                    String strValorPIS = formato.format(pis.calculaImposto());
                    //Exibe os valores
                    escreva("\nValor base: R$ " + strValorBasePis, 1);
                    escreva("\nValor PIS: R$" + strValorPIS, 1);
                    //Adiciona o objeto a lista de pagamentos
                    pagamento.getlistImpostos().add(pis);
                    
                    break;
                
                //Processamento IPI    
                case "IPI":
                    escreva("\nCalculo do IPI: ", 1);
                    //Recebe os dados
                    aliquota = pagamento.entradaValor("\nAliquota: (%) ");                   
                    valor = pagamento.entradaValor("Valor do produto: R$ ");                  
                    frete = pagamento.entradaValor("Frete: R$ ");                  
                    seguro = pagamento.entradaValor("Seguro: R$ ");                   
                    outrasDesp = pagamento.entradaValor("Outras despesas: R$ ");
                    //Cria o objeto
                    ipi = new Imposto("IPI (Imposto sobre Produto Industrializado", aliquota);
                    //Calcula e formata os valores
                    String strValorBaseIpi = formato.format(ipi.calculaValorBaseIpi(valor, frete, 
                                                                                                   seguro, outrasDesp));
                    String strValorIpi = formato.format(ipi.calculaImposto());
                    //Exibe os valores
                    escreva("\nValor base: R$ " + strValorBaseIpi, 1);
                    escreva("\nValor IPI: R$ " + strValorIpi, 1);
                    //Adiciona o objeto a lista de pagamentos
                    pagamento.getlistImpostos().add(ipi);
                    
                    break;
                //Encerra o cadastro    
                case "pare":
                    escreva("\nEncerrando...", 1);
                    break;
                //Adverte se o tipo de imposto não estiver cadastrado    
                default:
                    escreva("\nImposto não cadastrado.", 1);
                    break;
            }
        }
        while(!tipoImposto.equals("pare"));
        
        //Saída
        pagamento.listPagamentos();       
    }
    
    // Função para escrever
    // Modo 1 adiciona quebra de linha
    // Modo 2 não adiciona quebra de linha
    public static void escreva(String texto, int modo)
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
    public static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }
    
    //Função para verificar se um determinado valor é float
    public static boolean isFloat(String str)
    {
        boolean flutuante;
        
        if(str.matches("[0-9]") || str.matches("[.]"))
        {
            flutuante = true;
        }
        else
        {
            flutuante = false;
        }
        
        return flutuante;
    }
    
}
