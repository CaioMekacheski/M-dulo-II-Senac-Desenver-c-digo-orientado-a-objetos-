
package exercicio_java;


public class Aluno 
{
    String nome;
    String cpf;
    int matricula;
    int idade;
    float nota1;
    float nota2;
    
    private float media(float valor1, float valor2)
    {
        return (valor1 + valor2) / 2;
    }
    
    private float maiorNota()
    {
        if(nota1 >= nota2)
        {
            return nota1;
        }
        
        else
        {
            return nota2;
        }
    }
    
    public void descrever()
    {
        System.out.println("\n\nDADOS DO ALUNO:\n");
        System.out.println("NOME: \t" + nome);
        System.out.println("CPF: \t" + cpf);
        System.out.println("MATRICULA: \t" + matricula);
        System.out.println("IDADE: \t" + idade);
        System.out.println("NOTA ATIVIDADE 1: \t" + nota1);
        System.out.println("NOTA ATIVIDADE 2: \t" + nota2);
        System.out.println("\nMÉDIA: " + media(nota1, nota2));
        System.out.println("MAIOR NOTA: " + maiorNota());

    }
}
