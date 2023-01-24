
package exercicio_java;


public class Exercicio_java 
{
    public static void main(String[] args) 
    {
        Aluno[] aluno = new Aluno[3];
        
        for(int i = 0; i < 3; i++)
        {
            aluno[i] = new Aluno();
        }
        
        aluno[0].nome = "Caio Mekacheski";
        aluno[0].cpf = "24848718941";
        aluno[0].matricula = 150;
        aluno[0].idade = 36;
        aluno[0].nota1 = 6;
        aluno[0].nota2 = 8;
                
        
        aluno[1].nome = "Letícia Arias";
        aluno[1].cpf = "54398115945";
        aluno[1].matricula = 151;
        aluno[1].idade = 27;
        aluno[1].nota1 = 10;
        aluno[1].nota2 = 9;
        
        aluno[2].nome = "Isadora Araújo";
        aluno[2].cpf = "2148416921";
        aluno[2].matricula = 152;
        aluno[2].idade = 10;
        aluno[2].nota1 = 10;
        aluno[2].nota2 = 10;
        
        System.out.println("\t\t ALUNOS MATRICULADOS: \n\n");
        
        aluno[0].descrever();
        aluno[1].descrever();
        aluno[2].descrever();


    }
    
}
