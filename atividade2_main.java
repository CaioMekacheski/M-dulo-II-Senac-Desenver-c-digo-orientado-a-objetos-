//Criado 13/02/2023 01:23
package atividade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade2 
{
    public static void main(String[] args) 
    { 
        //Objetos
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        Transporte transp1;
        Hospedagem hos1;
        PacoteDeViagem pacote1;
        Venda venda;
        
        //Entrada Pacote de viagem
        escreva("\t\tJL Turismo", 1);
        escreva("Cadastro de pacote de viagem", 1);
        
        //Destino
        escreva("\nDestino: ", 2);
        String destinoViagem = entrada.nextLine();
        
        //Dias
        int qtdDias;
        String strDias;
        String caracterDias = "";
        
        do
        {
            escreva("\nDias: ", 2);
            strDias = entrada.nextLine();
            
            //Verifica se o valor digitado é inteiro
            for(int i = 0; i < strDias.length(); i++)
            {
                char charDia = strDias.charAt(i);
                caracterDias = Character.toString(charDia);
                
                if(isInt(caracterDias) != true)
                {
                    escreva("Valor inválido. Insira um valor numérico.", 1);
                    break;
                }
            }    
        }
        while(isInt(caracterDias) != true);
        
        qtdDias = Integer.parseInt(strDias);
        
        //Transporte
        float valorTransp;
        String strValorTransp;
        String caracterValorTransp = "";
        
        
        escreva("\nTransporte:", 1);
        escreva("Tipo: ", 2);
        String tipoTransp = entrada.nextLine();
        
        do
        {
            escreva("\nValor: ", 2);
            strValorTransp = entrada.nextLine();
        
            for(int i = 0; i < strValorTransp.length(); i++)
            {
                char charValorTransp = strValorTransp.charAt(i);
                caracterValorTransp = Character.toString(charValorTransp);
                
                if(isFloat(caracterValorTransp) != true)
                {
                    escreva("Valor inválido. Insira um valor numérico.", 1);
                    break;
                }
            }
        
        }while(isFloat(caracterValorTransp) != true);
        
        valorTransp = Float.parseFloat(strValorTransp);
        
        transp1 = new Transporte(tipoTransp, valorTransp);
        
        //Hospedagem
        float valorHos;
        String strValorHos;
        String caracterValorHos = "";
        
        escreva("\nHospedagem:", 1);
        escreva("Descrição: ", 2);
        String descrHos = entrada.nextLine();
        
        do
        {
            escreva("\nValor da diária: ", 2);
            strValorHos = entrada.nextLine();
        
            for(int i = 0; i < strValorHos.length(); i++)
            {
                char charValorHos = strValorHos.charAt(i);
                caracterValorHos = Character.toString(charValorHos);
                
                if(isFloat(caracterValorHos) != true)
                {
                    escreva("Valor inválido. Insira um valor numérico.", 1);
                    break;
                }
            }
        
        }while(isFloat(caracterValorHos) != true);
        
        valorHos = Float.parseFloat(strValorHos);
       
        hos1 = new Hospedagem(descrHos, valorHos);
        
        //Pacote de Viagem
        pacote1 = new PacoteDeViagem(destinoViagem, qtdDias, hos1, transp1);
        
        //Saída
        //Detalhes do pacote
        escreva("\nPacote de viagem criado:", 1);
        escreva("Destino: " + pacote1.getDestino(), 1);
        escreva("Quantidade de dias: " + pacote1.getDia(), 1);
        escreva("Opção de hospedagem: " + pacote1.getHospedagem().getTipo(), 1);
        escreva("Valor total da hospedagem: R$ " + pacote1.calculaHospedagem(qtdDias), 1);
        escreva("Opção de transporte: " + pacote1.getTransporte().getTipo(), 1);
        escreva("Valor do transporte: RS " + pacote1.getTransporte().getValor(), 1);
        float subTotalPacote = 
                pacote1.calculaPacote(pacote1.calculaHospedagem(qtdDias),
                        pacote1.getTransporte().getValor(), 0, 0);
        //Total sem o lucro
        escreva("Total dos serviços: " + subTotalPacote, 1);
        
        //Entrada do percentual de lucro
        float lucroPercent;
        String strLucroPercent;
        String caracterLucroPercent = "";
        
        do
        {
            escreva("Margem de lucro (%): ", 2);
            strLucroPercent = entrada.nextLine();
            
            //Verifica se o valor é float
            for(int i = 0; i < strLucroPercent.length(); i++)
            {
                char charLucroPercent = strLucroPercent.charAt(i);
                caracterLucroPercent = Character.toString(charLucroPercent);
                
                if(isFloat(caracterLucroPercent) != true)
                {
                    escreva("Valor inválido. Insira um valor numérico.", 1);
                    break;
                }
            }
        }
        while(isFloat(caracterLucroPercent) != true);
        
        lucroPercent = Float.parseFloat(strLucroPercent);
        
        //Calcula o lucro
        float lucro = pacote1.calculaLucro(lucroPercent, subTotalPacote);
        
        //Custos adicionais
        float custoAdicional;
        String strCustoAdicional;
        String caractereCustoAdicional = "";
        
        do
        {
            escreva("Custos adicionais: R$ ", 2);
            strCustoAdicional = entrada.nextLine();
            
            //Verifica se o valor é float
            for(int i = 0; i < strCustoAdicional.length(); i++)
            {
                char charCustoAdicional = strCustoAdicional.charAt(i);
                caractereCustoAdicional = Character.toString(charCustoAdicional);
                
                if(isFloat(caractereCustoAdicional) != true)
                {
                    escreva("Valor inválido. Insira um valor numérico.", 1);
                    break;
                }
            }
        }
        while(isFloat(caractereCustoAdicional) != true);
        
        custoAdicional = Float.parseFloat(strCustoAdicional);
        
        //Exibe o total do pacote incluindo o lucro
        escreva("Total do pacote: R$ " + pacote1.calculaPacote(pacote1.calculaHospedagem(qtdDias),
                        pacote1.getTransporte().getValor(), lucro, custoAdicional), 1);
        
        //Entrada Venda
        escreva("Venda de pacote de viagem", 1);
        escreva("Cliente: ", 2);
        String nomeCliente = entrada.nextLine();
        escreva("Forma de pagamento : ", 2);
        String formaPagamento = entrada.nextLine();
        
        venda = new Venda(nomeCliente, formaPagamento, pacote1);
        
        //Cotação do dolar
        float dolar;
        String strDolar;
        String caracterDolar = "";
        
        do
        {
            escreva("Cotação do dolar: R$ ", 2);
            strDolar = entrada.nextLine();
            
            //Verifica se o valor é float
            for(int i = 0; i < strDolar.length(); i++)
            {
                char charDolar = strDolar.charAt(i);
                caracterDolar = Character.toString(charDolar);
                
                if(isFloat(caracterDolar) != true)
                {
                    escreva("Valor inválido. Insira um valor numérico.", 1);
                    break;
                }
            }
        }
        while(isFloat(caracterDolar) != true);
        
        dolar = Float.parseFloat(strDolar);
        
        //Calcula o total em reais e em dolares
        float totalPacote = venda.getPacote().calculaPacote(venda.getPacote().calculaHospedagem(qtdDias), 
                venda.getPacote().getTransporte().getValor(), lucro, custoAdicional);
        float totalDolar = venda.convertRealUSD(totalPacote,dolar);
        
        //Formata os valores com 2 casas decimais
        String strTotalPacote = formato.format(totalPacote);
        String strTotalDolar = formato.format(totalDolar);
   
        //Saída venda
        escreva("Venda realizada", 1);
        escreva("Cliente: " + venda.getCliente(), 1);
        escreva("Pacote selecionado: " + venda.getPacote().getDestino() + " " 
                + venda.getPacote().getDia() + " dia(s).", 1);
        escreva(venda.exibeTotais(strTotalPacote, strTotalDolar), 1);
        
        escreva("Forma de pagamento: " + venda.getPagamento(), 1);
    }
    
    // Função para escrever
    //Modo 1 adiciona quebra de linha
    //Modo 2 não adiciona quebra de linha
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
    
    //Função para verificar se um determinado valor é inteiro
    private static boolean isInt(String str)
    {
        boolean inteiro;
        
        if(str.matches("[0-9]"))
        {
            inteiro = true;
        }
        else
        {
            inteiro = false;
        }
        return inteiro;
    }
        
    //Função para verificar se um determinado valor é float
    private static boolean isFloat(String str)
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
