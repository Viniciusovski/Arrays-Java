/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarray;

import java.util.Arrays;

/**
 *
 * @author Vinícius
 */
public class ExercicioArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double notaAlunoA[] = new double [3];
        notaAlunoA[0] = 7.9;
        notaAlunoA[1] = 8;
        notaAlunoA[2] = 6.7;
        
        System.out.println(Arrays.toString(notaAlunoA));
        
        //para percorrer o array
        double totalA = 0;
        for(int i = 0; i < notaAlunoA.length; i++){
            totalA += notaAlunoA[i];
        }
        //Média
        System.out.print(totalA / notaAlunoA.length);
        
        double notaAlunoB[] = {6.9, 8.9, 5.5, 10};
        double totalB = 0;
        for (int i = 0; i < notaAlunoB.length; i++) {
            totalB += notaAlunoB[i];
            
        }
        System.out.print(totalB / notaAlunoB.length);
   }
    
}
