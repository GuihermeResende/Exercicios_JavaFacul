package atividade;
import java.util.Scanner;
import java.util.Arrays;
public class MatrizExercicioAlunos {

	public static void main(String[] args) {
				
				double [] [] notasAlunos = new double [3] [4];
				
				notasAlunos [0][0] = 8;
				notasAlunos [0][1] = 10;
				notasAlunos [0][2] = 10;
				notasAlunos [0][3] = 9;
				
				notasAlunos [1][0] = 8;
				notasAlunos [1][1] = 5;
				notasAlunos [1][2] = 10;
				notasAlunos [1][3] = 10;
				
				notasAlunos [2][0] = 8;
				notasAlunos [2][1] = 7;
				notasAlunos [2][2] = 10;
				notasAlunos [2][3] = 10;
				
				double soma=0;
				for (int i = 0; i < notasAlunos.length; i++) {
					for (int j = 0; j < notasAlunos[i].length; j++) {
						System.out.println(notasAlunos[i][j] + " ");
						soma += notasAlunos[i][j];
						
					}
					System.out.println("----------------");
				}
				
				double media = soma/12;
				
				
				System.out.println("A média total é: " + media);
				System.out.println("----------------");
				
				for (double[] item : notasAlunos) {
					System.out.println(Arrays.toString(item));
				}

	
	}

}
