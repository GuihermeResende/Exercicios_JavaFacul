package atividade;

public class forEach {

	public static void main(String[] args) {
		int[] vetor = {5,3,2,4};
	
	for (int item : vetor) {
		System.out.println(item);   // varre, imprime o vetor
	}
	System.out.println("------------------");
	
	for (int i= 0; i < vetor.length; i++) {
		System.out.println(i);          // 
	}
	}

}
