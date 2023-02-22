//Atualizado 22/02/2023 19:18
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
        
        //Entrada
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
                escreva("Tipo de contrato (1)Assalariado (2)Horista: ", 2);
                String tipoContrato = entrada.nextLine();
                
                //Cria um novo objeto de acordo com o tipo de contrato
                do
                {
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

                            funcionario[i] = new Assalariado(nome, cpf, endereco, fone, setor, salarioBase, diasTrabalhados);
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
                            escreva("Opção inválida.\nDigite (1)Para Assalariado\n(2)Para Horista", 1);
                    }
                    
                }
                while(!"1".equals(tipoContrato) && !"2".equals(tipoContrato));
                
                //Atualiza a lista de funcionários
                escreva("\nFuncionários Cadastrados\n", 1);
                
                for(int j = 0; j <= i; j++)//Uso como referência o indice do laço for principal
                {
                    escreva("Funcionário " + (j+1) + ": " + funcionario[j].nome, 1);
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
                            continuar = true;
                            break;

                        case "n":
                            continuar = false;
                            i = numFunc+1;
                            break;

                            default:
                                escreva("Opção inválida.\nDigite 'S' ou 'N'", 1);
                                break;
                    }
                }
                while(!"n".equals(opcao) && !"s".equals(opcao));
                
                
            }
        }
        while(continuar);
       
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
