
package exercicio_java;


public class Aluno 
{
    String nome;
    String cpf;
    int matricula;
    int idade;
    
    public void descrever()
    {
        System.out.println("\n\nDADOS DO ALUNO:\n");
        System.out.println("NOME: \t" + nome);
        System.out.println("CPF: \t" + cpf);
        System.out.println("MATRICULA: \t" + matricula);
        System.out.println("IDADE: \t" + idade);

    }
}
