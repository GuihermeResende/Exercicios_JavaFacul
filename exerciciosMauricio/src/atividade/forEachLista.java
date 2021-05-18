package atividade;
import java.util.Arrays;
public class forEachLista {

	public static void main(String[] args) {
		
		float[] pesosProdutos = {10.2f,0,0,0,100,0,0,0,30.5f};
			float total = 0;
			
		for (float peso : pesosProdutos) {
			System.out.println(peso);
		    total =+ peso;
		}

		System.out.println("----------");
		System.out.println("Total " + total);
	}

}