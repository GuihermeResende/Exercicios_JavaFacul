/*package atividade;
import java.util.Arrays;
import java.util.Scanner;
public class ListaExerciciosArrays06112020 {


	public static void main(String[] args) {
		//1.	Desenvolva um programa que efetue a leitura de 10 elementos para u vetor A e apresente no final a somat�ria dos elementos �mpares.

	 Scanner entrada = new Scanner(System.in);
	
	 
	 System.out.println("Digite 10 valores: ");
	 
	 int[] VetorA = new int[10];
	 
	 int i = 0;
	 int soma = 0;
	 
	 while (i < VetorA.length) {
	  int numeros = entrada.nextInt();
	  i++;
	  if (numeros % 2 == 1) {
		  soma += numeros;
	 
	 }
	  
	 }
	 System.out.println("Soma dos �mpares: " + soma);
	
	
	}

}      */
//--------------------------------------------------------------------------------------------------------------
/*package atividade;

import java.util.Arrays;
import java.util.Random;

public class ListaExerciciosArrays06112020 {

	public static void main(String[] args) {

		// 2. Ler duas vetor A e B com 20 elementos. Construir um vetor C, sendo este
		// formado pelos elementos de A subtra�dos dos elementos de B.

		Random rdn = new Random(); 

		int[] VetorA = new int[20];
		int[] VetorB = new int[20];
		int[] VetorC = new int[20];
  
		
		for (int i = 0; i < VetorA.length; i++) {
			VetorA[i] = rdn.nextInt(100);

		}
			for(int i = 0; i < VetorB.length; i++) {
				VetorB[i] = rdn.nextInt(100);
				
			}
			
			System.out.println("VetorA - " + Arrays.toString(VetorA));
			System.out.println("VetorB - " + Arrays.toString(VetorB));
			
		
		for(int i = 0; i < VetorC.length; i++) {
			VetorC[i] = VetorA[i] - VetorB[i];
		
		}
		System.out.println("Subtra��o dos vetores: ");
		System.out.println(Arrays.toString(VetorC));
	}
}   */
//----------------------------------------------------------------------------------------------------
/*package atividade;

import java.util.Arrays;
import java.util.Scanner;

public class ListaExerciciosArrays06112020 {

	public static void main(String[] args) {

//3.	Ler duas vetor A e B de 4 elementos cada. Construir um vetor C, sendo este a jun��o das duas outras vetor. Desta forma, C dever� ter o dobro de elementos, ou seja, 8.


		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 4 elementos do VetorA e 4 do VetorB: ");
		
		int [] VetorA = new int[4];
		int [] VetorB = new int[4];
		int [] VetorC = new int[8];
	
	   for (int i = 0; i < VetorA.length;i++) {
		   VetorA[i] = entrada.nextInt();
	       VetorC[i] = VetorA[i];
	   }
	
	   int x = 0;
		for (int i = 4; i < VetorC.length; i++) {
			VetorB[x] = entrada.nextInt();
			VetorC[i] = VetorB[x];
			x++;
	}


		for (int Total : VetorC) {
			System.out.println(Total);
        }
     }
 }    */
//---------------------------------------------------------------------------------------------------
/*package atividade;

import java.util.Arrays;


public class ListaExerciciosArrays06112020 {

	public static void main(String[] args) {

//4.	Dados dois vetores X, Y com 3 palavras, construa um terceiro vetor R com essas 6 palavras

		String[] VetorX = {"Guilherme", "Resende", "Monteiro"};
		String[] VetorY = {"Aluno", "TI", "SegundoSemetre"};
		String[] VetorR = new String[6];
		
		for (int i = 0; i < VetorX.length;i++) {
			VetorR[i] = VetorX[i];
		}
		
		int x = 0;
		for(int i = 3; i < VetorR.length; i++) {
		    VetorR[i] = VetorY[x];
		    x++;
		}
		
		for (String Vetores : VetorR) {
			System.out.println(Vetores);
		}
	}
}     */
//------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Arrays;


public class ListaExerciciosArrays06112020 {

	public static void main(String[] args) {
		
		//5.	Criar um vetor A e B, R. Somar o valor do vetor A com o vetor B e armazenar o resultado no vetor R.
	
	int[] VetorA = {5};
	int[] VetorB = {1};
	int[] VetorC = new int[1];
	
	for(int i = 0; i < VetorC.length; i++) {
	VetorC[i] = VetorA[i] + VetorB[i];
	
	}
	
	System.out.println("A soma do valor do VetorA e VetorB s�o: ");
	for (int i : VetorC) {
		
		System.out.println(i);
	    
	}
	
	}
	
	}    */
//------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Arrays;
import java.util.Scanner;

public class ListaExerciciosArrays06112020 {

	public static void main(String[] args) {


//6.	Escrever um algoritmo que l� um vetor N(10) e o escreve. Encontre, a seguir, o menor elemento e a sua posi��o no vetor N e escreva:  
//"O menor elemento de N � = ... e a sua posi��o � ... "

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 10 n�meros do VetorN: ");
		
		int[] VetorN = new int[10];
		 
		VetorN[0] = entrada.nextInt();
		int elementoMenor = VetorN[0], posicao = 0;
		
		for(int i= 0; i < VetorN.length - 1; i++) {
		 VetorN[i] = entrada.nextInt();
		
		
			if (VetorN[i] < elementoMenor) {
		        elementoMenor = VetorN[i];
		        posicao = i;
		    }
		
		}
		
		System.out.println(Arrays.toString(VetorN));
		System.out.println("O menor elemento de N = " + elementoMenor + ", e a sua posi��o �: " + posicao);
		
		
		
}
}    */
//---------------------------------------------------------------------------------------------------------------------
/*package atividade;

import java.util.Arrays;
import java.util.Scanner;

public class ListaExerciciosArrays06112020 {

	public static void main(String[] args) {

//7.	Construa uma aplica��o que recebe uma quantidade  indeterminada de n�meros inteiros e conte quantos deles  est�o nos seguintes intervalos:  [1-25], [26-50], [51-75] e [76-100].  A entrada de dados dever� terminar quando for lido o n�mero 0.

		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;
		for (int i = 1; i >= 1; i++) {
			System.out.println("Digite um n�mero inteiro: ");
			int numero = entrada.nextInt();

			if (numero >= 1 && numero <= 25) {
				soma = soma + 1;
				System.out.println("intervalo de [1 - 25] " + soma + " vez(es)");
			} else {
				if (numero >= 26 && numero <= 50) {
					soma1 = soma1 + 1;
					System.out.println("intervalo de [26 - 50] " + soma1 + " vez(es)");

				} else if (numero >= 50 && numero <= 75) {
					soma2 = soma2 + 1;
					System.out.println("intervalo de [51 - 75] " + soma2 + " vez(es)");
				}

				else if (numero >= 76 && numero <= 100) {
					soma3 = soma3 + 1;
					System.out.println("intervalo de [76 - 100] " + soma3 + " vez(es)");

				}

			}
		}
	}
}           */