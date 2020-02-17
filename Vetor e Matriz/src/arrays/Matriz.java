package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         System.out.println("Quantos alunos?");
         int qtdeAlunos = entrada.nextInt();
         
         System.out.println("Quantas notas por aluno?");
         int qtdeNotas = entrada.nextInt();
         
         double notasDaTurma [][] = new double [qtdeAlunos] [qtdeNotas];
         
         double total = 0;
         //Pra cada elemento do array mais externo ele vai percorrer uma nota
         // o A é o aluno e o N é a nota
         for (int a = 0; a < notasDaTurma.length; a++) {
             for (int n = 0; n < notasDaTurma[a].length; n++) { 
                 System.out.printf("Informe a nota %d do aluno %d ", n + 1, a + 1);
                 
                 notasDaTurma[a][n] = entrada.nextDouble();
                 total += notasDaTurma[a][n];
                 
             }
            
        }
         
         double media = total / (qtdeAlunos * qtdeNotas);         
         System.out.println("Média da turma é " + media);
         
         for(double[] notasDoAluno: notasDaTurma){//Para os lementos de notasDaTurma também ficarem em notasDoAluno
            System.out.println(Arrays.toString(notasDoAluno));
         }
         entrada.close();
    }
}
