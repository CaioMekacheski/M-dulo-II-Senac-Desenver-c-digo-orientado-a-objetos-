
package exercicio_java;


public class Exercicio_java 
{
    public static void main(String[] args) 
    {
        Aluno aluno01 = new Aluno();
        Aluno aluno02 = new Aluno();
        Aluno aluno03 = new Aluno();
        
        aluno01.nome = "Caio Mekacheski";
        aluno01.cpf = "24848718941";
        aluno01.matricula = 150;
        aluno01.idade = 36;
        aluno01.nota1 = 6;
        aluno01.nota2 = 8;
                
        
        aluno02.nome = "Letícia Arias";
        aluno02.cpf = "54398115945";
        aluno02.matricula = 151;
        aluno02.idade = 27;
        aluno02.nota1 = 10;
        aluno02.nota2 = 9;
        
        aluno03.nome = "Isadora Araújo";
        aluno03.cpf = "2148416921";
        aluno03.matricula = 152;
        aluno03.idade = 10;
        aluno03.nota1 = 10;
        aluno03.nota2 = 10;
        
        System.out.println("\t\t ALUNOS MATRICULADOS: \n\n");
        
        aluno01.descrever();
        aluno02.descrever();
        aluno03.descrever();


    }
    
}
