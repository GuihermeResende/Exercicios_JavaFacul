package atividade;

import java.util.Arrays;

public class MatrizEx5 {

	public static void main(String[] args) {
		int [][] notasAlunos = new int[11][6];
		
		
		
		  for(int i = 0 ; i < notasAlunos.length;i++) {
			  for(int j= 0; j < notasAlunos[i].length;j++) {
		         notasAlunos[i][j] = i;
		  }
	
		  }
			  for (int[] is : notasAlunos) {
				System.out.println(Arrays.toString(is));

	}

}
}
