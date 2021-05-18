package atividade;

public class MatrizEX2 {

	public static void main(String[] args) {
		
		double [][] notasAlunos = new double[3][10];

		  notasAlunos [0][0] = 0;
		  notasAlunos [0][1] = 1;
		  notasAlunos [0][2] = 2;
		  notasAlunos [0][3] = 3;
		  notasAlunos [0][4] = 4;
		  notasAlunos [0][5] = 5;
		  notasAlunos [0][6] = 6;
		  notasAlunos [0][7] = 7;
		  notasAlunos [0][8] = 8;
		  notasAlunos [0][9] = 9;
		 
		  notasAlunos [1][0] = 0;
		  notasAlunos [1][1] = 1;
		  notasAlunos [1][2] = 2;
		  notasAlunos [1][3] = 3;
		  notasAlunos [1][4] = 4;
		  notasAlunos [1][5] = 5;
		  notasAlunos [1][6] = 6;
		  notasAlunos [1][7] = 7;
		  notasAlunos [1][8] = 8;
		  notasAlunos [1][9] = 9;
		  
		  notasAlunos [2][0] = 0;
		  notasAlunos [2][1] = 1;
		  notasAlunos [2][2] = 2;
		  notasAlunos [2][3] = 3;
		  notasAlunos [2][4] = 4;
		  notasAlunos [2][5] = 5;
		  notasAlunos [2][6] = 6;
		  notasAlunos [2][7] = 7;
		  notasAlunos [2][8] = 8;
		  notasAlunos [2][9] = 9;
		  
		  
		  for(int i = 0; i < notasAlunos.length;i++) {
			  for(int j= 0; j < notasAlunos[i].length;j++)
		       System.out.println(notasAlunos[i][j] + " ");
			  System.out.println("--------------");
		  }
	
		
		
	}

}
