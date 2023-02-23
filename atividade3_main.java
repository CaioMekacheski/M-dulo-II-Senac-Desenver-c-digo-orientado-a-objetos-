//Atualizado 22/02/2023 21:40
package atividade3;

import java.util.Scanner;

public class Atividade3 
{
    
    public static void main(String[] args) 
    {
        //Variáveis
        int numFunc = 10;
        boolean continuar = true;
        String opcao;
        
        //Objetos
        Scanner entrada = new Scanner(System.in);
        Funcionario[] funcionario = new Funcionario[numFunc];
        
        //Cadastro de funcionários
        escreva("\t\tCADASTRO DE FUNCIONÁRIOS", 1);
        do 
        {   
            int i;
            for(i = 0; i < numFunc; i++)
            {
                escreva("Nome: ", 2);
                String nome = entrada.nextLine();
                escreva("CPF: ", 2);
                String cpf = entrada.nextLine();
                escreva("Endereço: ", 2);
                String endereco = entrada.nextLine();
                escreva("Telefone: ", 2);
                String fone = entrada.nextLine();
                escreva("Setor: ", 2);
                String setor = entrada.nextLine();
                String tipoContrato;
                
                //Cria um novo objeto de acordo com o tipo de contrato
                do
                {
                    escreva("Tipo de contrato (1)Assalariado (2)Horista: ", 2);
                    tipoContrato = entrada.nextLine();
                    switch(tipoContrato)
                    {
                        //Tipo de contrato assalariado
                        case "1":
                            escreva("Tipo de contrato selecionado: Assalariado", 1);
                            escreva("Salario base: R$ ", 2);
                            float salarioBase = entrada.nextFloat();
                            clearBuffer(entrada);
                            escreva("Dias trabalhados: ", 2);
                            int diasTrabalhados = entrada.nextInt();
                            clearBuffer(entrada);

                            funcionario[i] = new Assalariado(nome, cpf, endereco, 
                                                                fone, setor, salarioBase, diasTrabalhados);
                            break;

                        case "2":
                                
                            //Tipo de contrato horista
                            escreva("Tipo de contrato selecionado: Horista", 1);
                            escreva("Valor hora: R$ ", 2);
                            float valorHora = entrada.nextFloat();
                            clearBuffer(entrada);
                            escreva("Horas trabalhadas: ", 2);
                            float horasTrabalhadas = entrada.nextFloat();
                            clearBuffer(entrada);

                            funcionario[i] = new Horista(nome, cpf, endereco, fone, setor, valorHora, horasTrabalhadas);
                            break;

                        default:
                            escreva("Opção inválida.", 1);
                            break;
                    }
                    
                }
                while(!"1".equals(tipoContrato) && !"2".equals(tipoContrato));
                
                //Atualiza a lista de funcionários
                escreva("\nFuncionários Cadastrados\n", 1);
                
                for(int j = 0; j <= i; j++)//Uso como referência o indice do laço for principal
                {
                    escreva("Funcionário " + (j+1) + ": " + funcionario[j].getNome() + 
                            " Setor: " + funcionario[j].getSetor(), 1);
                }
                
                //Senão pergunta se deseja realizar outro cadastro
                
                do
                {
                    escreva("\nDeseja cadastrar outro funcionário? (S)im/ (N)ão ", 2);
                    opcao = entrada.nextLine();

                    //Verifica a opção selecionada
                    switch(opcao)
                    {
                        case "s":
                            escreva("\n",2);
                            continuar = true;
                            break;

                        case "n":
                            continuar = false;
                            i = numFunc+1;
                            break;

                            default:
                                escreva("\nOpção inválida.\nDigite 'S' ou 'N'", 1);
                                break;
                    }
                }
                while(!"n".equals(opcao) && !"s".equals(opcao));
                       
            }
        }
        while(continuar);
        
        //Lista detalhada de funcionários
        for(int i = 0; i < numFunc; i++)
        {
            if(funcionario[i] != null)
            {
                escreva(funcionario[i].exibeInfo(), 1);
            }
            
        }
        
        //Aplicação de aumento
        escreva("\t\tAUMENTO DE SALÁRIO", 1);
        escreva("\nDigite uma porcentagem para calcular o aumento geral dos funcionários: ", 2);
        float percent;
        String strPercent = entrada.nextLine();
        
        //Verifica se o valor é float
        for(int i = 0; i < strPercent.length(); i++)
        {
            char chPercent = strPercent.charAt(i);
            String caracterPercent = Character.toString(chPercent);
            
            if(isFloat(caracterPercent) != true)
            {
                escreva("Valor inválido. Digite um valor numérico.", 1);
                break;
            }
        }
        
        //Calcula o aumento
        percent = Float.parseFloat(strPercent);
        
        for(int i = 0; i < numFunc; i++)
        {
            if(funcionario[i] != null)
            {
                funcionario[i].aplicaAumento(percent);
            }
            
        }
        
        //Exibição das informações atualizadas
        for(int i = 0; i < numFunc; i++)
        {
            if(funcionario[i] != null)
            {
                escreva(funcionario[i].exibeInfo(), 1);
            }
            
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
