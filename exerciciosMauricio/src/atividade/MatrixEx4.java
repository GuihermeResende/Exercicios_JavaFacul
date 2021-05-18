package atividade;

import java.util.Arrays;

public class MatrixEx4 {

	public static void main(String[] args) {
		
		int [][] notasAlunos = new int[6][6];
		
	
		  for(int i = 0; i < notasAlunos.length;i++) {
			  for(int j= 0; j < notasAlunos[i].length;j++) {
		         notasAlunos[i][j] = i;
		  }
	
		  }
			  for (int[] is : notasAlunos) {
				System.out.println(Arrays.toString(is));
	}
	
}
}
