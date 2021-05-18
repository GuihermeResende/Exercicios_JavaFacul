package atividade;
import java.util.Arrays;
public class EstruturaVetor {

	public static void main(String[] args) {
	
		double[] notasAlunoA = new double[3];
	
		notasAlunoA[0] = 9;
		notasAlunoA[1] = 8;   // ou double[] notasAlunoA = { 6, 8 , 10} ;
		notasAlunoA[2] = 10;
	
		double totalAluno = 0;
		for (int i = 0; i < 3; i++) {
		  totalAluno += notasAlunoA[i];
		
	
	
	}
		System.out.println("media: " + totalAluno / 3); //notasAluno.lenght
		
		System.out.println(notasAlunoA[2]);  //exemplo  ou notasAluno.length 
		
		
	    System.out.println(Arrays.toString(notasAlunoA));
	
}
}