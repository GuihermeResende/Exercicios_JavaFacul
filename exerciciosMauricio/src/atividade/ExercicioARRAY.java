/*package atividade;
import java.util.Arrays;
import java.util.Random;
public class ExercicioARRAY {

	public static void main(String[] args) {
		
		//1.	Desenvolva um programa que efetue a leitura de 10 valores para um vetor A e que esses valores sejam passados para a vetor B

		 //zap mae
	
		//Para cada elemento do vetor de 10 posições, escreva o seu valor e a sua posição, começando na última posição e terminando na primeira posição;

	Random rdn = new Random(); 
	
	int[] x = new int[10];
	int[] copia = new int [10];
	
	for (int i = 0; i < x.length; i ++) {
		x[i] = rdn.nextInt(100);
		copia[i] = x[i];
	}
	
	System.out.println("Vetor: " + Arrays.toString(x));
	System.out.println("Cópia: " + Arrays.toString(copia));  

	
	}

}  */
//------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Arrays;
import java.util.Scanner;
public class ExercicioARRAY {

	public static void main(String[] args) {
		
// 2.  acrescentar 10 disso
		Scanner entrada = new Scanner(System.in)
		
		
		 int[] VetorA = new int[10];
         int[] VetorB = new int [10];
		
		System.out.println("Digite 10 valores: ");
       
       for (int i = 0; i < VetorA.length; i++) {
    	   
       VetorA[i] = entrada.nextInt();
       VetorC[i] = VetorA[i] + 10;
       
       }
		System.out.println(Arrays.toString(VetorA));
		System.out.println(Arrays.toString(VetorB));
	}
	}    */
//----------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Arrays;
import java.util.Scanner;
public class ExercicioARRAY {

	public static void main(String[] args) {
		
//Para cada elemento do vetor de 10 posições, escreva o seu valor e a sua posição, começando na última posição e terminando na primeira posição;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite 10 valores: ");
		
		int [] vetorA = new int[10];
		
		int posicao = 0;
		for (int i = 10; i >= 0; i-- ) {
		    vetorA[i] = entrada.nextInt();
		    posicao++;
		}
		
		System.out.println(Arrays.toString(vetorA));
		System.out.println("posição: " + posicao);
	   
	
	}
}       */
//-------------------------------------------------------------------------------------------------------
package atividade;
import java.util.Arrays;
import java.util.Scanner;
public class ExercicioARRAY {

	public static void main(String[] args) {
		//Desenvolva um programa que efetue a leitura de 10 valores para um vetor A e que esses valores sejam passados para a vetor B verificando se o índice for par deverá ser multiplicado por 5 e se for impar, somado a 5

	
				Scanner sc = new Scanner(System.in);
				
				int[] vetorA = new int[5];
				int[] vetorB = new int[5];
				
				for (int i = 0; i < vetorA.length; i++) {
					vetorA[i] = sc.nextInt();
				}
				
				System.out.println(Arrays.toString(vetorA));
				
				for (int i = 0; i < vetorB.length; i++) {
					if (i % 2 == 0) {
						vetorB[i] = vetorA[i] * 5;
					}
					else {
						vetorB[i] = vetorA[i] + 5;
					}
				}
				System.out.println(Arrays.toString(vetorB));
			}
	
		
		
		
	}
	