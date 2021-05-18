package atividade;
import java.util.Scanner;
public class ForEachNotas {

	public static void main(String[] args) {
		//exercicio para pedir a quantidade de notas, e dps imprime a soma das notas..

	
	Scanner entrada = new Scanner(System.in);
	 
	System.out.println("Digite a quantidade de notas: ");
	 int qntNotas = entrada.nextInt();
	 
	 double soma = 0;double media = 0;
	 double [] notas = new double[qntNotas];
	 
	
	 for (int i = 0; i < notas.length; i++) {
		 System.out.println("Digite a " + (i + 1) + "º nota");
		 notas[i] = entrada.nextInt();
	      soma += notas[i];
	 }
	 media = soma / qntNotas;
	 System.out.println("Médias das notas: " + media);
	
	for (double nota : notas) {
		System.out.println(nota);
	}
		
	}

}
