package atividade;
import java.util.Scanner;
public class TabuadaFor {

	public static void main(String[] args) {
	/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10. O usu�rio deve informar de qual numero ele deseja ver a tabuada. A sa�da deve ser conforme o exemplo abaixo:
		o	Tabuada de 5:
			o	5 X 1 = 5
			o	5 X 2 = 10
			o	...
			o	5 X 10 = 50*/

       Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
	
		int numero = entrada.nextInt();
	
		for (int i = 1; i <= 10 ; i++ ) {
	   int tabuada = numero * i;
	   System.out.println(numero + "x" + i + "=" + tabuada);
	   
	  
	
	}

}
}