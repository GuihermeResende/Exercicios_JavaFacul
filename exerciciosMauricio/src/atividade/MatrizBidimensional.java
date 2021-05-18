package atividade;

public class MatrizBidimensional {   //Array de Arrays

	public static void main(String[] args) {
		double [][] notasAlunos = new double[3][4]; //10 alunos(linhas) e 4 notas(colunas)
	
	  notasAlunos [0][0] = 8;
	  notasAlunos [0][1] = 10;
	  notasAlunos [0][2] = 9;
	  notasAlunos [0][3] = 7;
	
	  notasAlunos [1][0] = 5;
	  notasAlunos [1][1] = 9;
	  notasAlunos [1][2] = 7;
	  notasAlunos [1][3] = 10;
	
	  notasAlunos [2][0] = 6;
	  notasAlunos [2][1] = 3;
	  notasAlunos [2][2] = 10;
	  notasAlunos [2][3] = 6;
	
	  for(int i = 0; i < notasAlunos.length;i++) {
		  for(int j= 0; j < notasAlunos[i].length;j++)
	       System.out.println(notasAlunos[i][j] + " ");
	  }
	
	
	System.out.println("--------------");
	
	
	
	
	
	
	}

}
