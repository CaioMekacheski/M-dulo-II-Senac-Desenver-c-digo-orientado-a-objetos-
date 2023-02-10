//Criado 10/02/2023 01:13
package atividade2;

import java.util.Scanner;

public class Atividade2 
{
    public static void main(String[] args) 
    {
        //Objetos
        Scanner entrada = new Scanner(System.in);
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
        escreva("\nDias: ", 2);
        int qtdDias = entrada.nextInt();
        clearBuffer(entrada);
        //Transporte
        escreva("\nTransporte:", 1);
        escreva("Tipo: ", 2);
        String tipoTransp = entrada.nextLine();
        escreva("\nValor: ", 2);
        float valorTransp = entrada.nextFloat();
        clearBuffer(entrada);
        transp1 = new Transporte(tipoTransp, valorTransp);
        //Hospedagem
        escreva("\nHospedagem:", 1);
        escreva("Descrição: ", 2);
        String descrHos = entrada.nextLine();
        escreva("\nValor da diária: R$ ", 2);
        float valorHos = entrada.nextFloat();
        clearBuffer(entrada);
        hos1 = new Hospedagem(descrHos, valorHos);
        //Pacote de Viagem
        pacote1 = new PacoteDeViagem(destinoViagem, qtdDias, hos1, transp1);
        
        //Saída
        //Detalhes do pacote
        escreva("Pacote de viagem criado:", 1);
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
        escreva("Margem de lucro (%): ", 2);
        float lucroPercent = entrada.nextFloat();
        clearBuffer(entrada);
        //Calcula o lucro
        float lucro = pacote1.calculaLucro(lucroPercent, subTotalPacote);
        //Exibe o total do pacote incluindo o lucro
        escreva("Total do pacote: R$ " + pacote1.calculaPacote(pacote1.calculaHospedagem(qtdDias),
                        pacote1.getTransporte().getValor(), lucro, 0), 1);
        
        //Entrada Venda
        escreva("Venda de pacote de viagem", 1);
        escreva("Cliente: ", 2);
        String nomeCliente = entrada.nextLine();
        escreva("Forma de pagamento : ", 2);
        String formaPagamento = entrada.nextLine();
        
        venda = new Venda(nomeCliente, formaPagamento, pacote1);
        escreva("Cotação do dolar: R$ ", 2);
        float dolar = entrada.nextFloat();
        float totalPacote = 
                venda.getPacote().calculaPacote(venda.getPacote().calculaHospedagem(qtdDias), 
                venda.getPacote().getTransporte().getValor(), lucro, 0);
        float totalDolar = venda.convertRealUSD
        (totalPacote,dolar);
        clearBuffer(entrada);
   
        //Saída venda
        escreva("Venda realizada", 1);
        escreva("Cliente: " + venda.getCliente(), 1);
        escreva("Pacote selecionado: " + venda.getPacote().getDestino() + " " 
                + venda.getPacote().getDia() + " dia(s).", 1);
        escreva(venda.exibeTotais(totalPacote, totalDolar), 1);
        
        escreva("Forma de pagamento: " + venda.getPagamento(), 1);
    }
    
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

    private static void clearBuffer(Scanner scanner) 
    {
        if (scanner.hasNextLine()) 
        {
            scanner.nextLine();
        }
    }
}
