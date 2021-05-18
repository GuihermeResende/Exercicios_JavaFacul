/*package atividade;

public class ListaEstruturaDeRepetição2_30102020 {

	public static void main(String[] args) {
		// 1. Faça um programa que imprima todos os número pares entre 0 e 100.

		int i = 0;

		while (i <= 100) {
			System.out.println(i);
			i = i + 2;

		}
	}
}     */

//-------------------------------------------------------------------------------------------------------
//2.	Faça um programa que imprima os números de 999 à 0 através de uma variável que seja decrementada a cada iteração

/*package atividade;

public class ListaEstruturaDeRepetição2_30102020 {

	public static void main(String[] args) {

		int i = 999;
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
	}
}  */

//----------------------------------------------------------------------------------------------------------

/*package atividade;

import java.util.Scanner;

public class ListaEstruturaDeRepetição2_30102020 {

	public static void main(String[] args) {

		// 3. Faça um programa que leia 5 números e informe a soma e a média dos
		// números.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite 5 números para o cálculo da média: ");
		float media = 0;
		int i = 1;
		int soma = 0;

		while (i <= 5) {
			int numeros = entrada.nextInt();
			i++;
			soma += numeros;
			media = (soma / 5);
		}

		System.out.println("A soma dos números é: " + soma + "\n" + "A média dos números é: " + media);

	}

}   */

//-------------------------------------------------------------------------------------------------------------
/*package atividade;

public class ListaEstruturaDeRepetição2_30102020 {

	public static void main(String[] args) {

//4.	Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
		
  int i= 1;
  
  while (i <= 50) {
	  System.out.println(i);
      i = i + 2;
  
  } 
	}
}    */
//--------------------------------------------------------------------------------------------
/*package atividade;

 public class ListaEstruturaDeRepetição2_30102020 {

 	public static void main(String[] args) {
 		//5.	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. 
	
 	int i = 1000;
 	while (i < 1999) {
 	    i++;
 		if (i % 11 == 5)
 	    System.out.println(i);
 		}
 	
 	}
 }    */
//---------------------------------------------------------------------------------------------------
/*package atividade;

public class ListaEstruturaDeRepetição2_30102020 {

	public static void main(String[] args) {
		// 6. Desenvolva um algoritmo que calcula o quadrado do números de 10 a 20.

		int i = 10;
		int quadrado = 0;

		while (i <= 20) {
			quadrado = i * i;
			System.out.println(i + "^" + i + "= " + quadrado);
			i++;
		}
	}
}    */
//---------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaEstruturaDeRepetição2_30102020 {

	public static void main(String[] args) {

//7.	Desenvolva um algoritmo que receba a idade de vinte pessoas e mostre a idade da pessoa mais nova.
	
		System.out.println("Digite a idade de 10 pessoas: ");
	
		Scanner entrada = new Scanner(System.in);

		int idade;
		int menor = 180;

		for (int i = 0; i < 10; i++) {

			System.out.print("Digite uma idade: ");
			idade = entrada.nextInt();

			if (idade < menor) {

				menor = idade;

			}

		}
		System.out.println("A pessoa mais nova possui: " + menor + " anos");

	}

}
  */
	
//-----------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaEstruturaDeRepetição2_30102020 {

	public static void main(String[] args) {

//8.	Desenvolva um algoritmo que receba dez números e calcule a média desses dez números.
		
	Scanner entrada = new Scanner (System.in);
		
		int i = 0;
		double soma = 0;
		
		System.out.println("Digite 10 números: ");
	while (i < 10) {
		int numeros = entrada.nextInt();
		soma += numeros;
		i++;
		
		
	}
	
	System.out.println(soma/ 10);
		
         }
}   */
//-------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaEstruturaDeRepetição2_30102020 {

	public static void main(String[] args) {
		//9.	Dados um capital, uma taxa de juros mensal e um período em meses, informe o montante ao final de cada mês. 
		//O programa deve funcionar como a seguir: 
		//Capital? 100.00 
		//Juros? 10 
		//Período? 3 
		//1º mês R$ 110,00 
		//2º mês R$ 121,00 
		//3º mês R$ 133,10
		
	Scanner entrada = new Scanner(System.in);  
	
	
    System.out.println("Digite um capital, uma taxa de juros mensal e um período em mêses: ");
    double capital = entrada.nextDouble();int juros = entrada.nextInt(); int periodo = entrada.nextInt();
    
    int i = 1;

	do {
		double taxa = juros * capital / 100;
		capital = capital + taxa;
		
		
		System.out.println((i) + "º" + "mês: " + capital);
		i++;
	
	} while (i < periodo);

	double taxa = juros * capital / 100;
	capital = capital + taxa;
	
	System.out.println((i) + "º" + "mês: " + capital);
	
	}
	
}
  */

//-------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaEstruturaDeRepetição2_30102020 {

	public static void main(String[] args) {



//10.	Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

   Scanner entrada = new Scanner(System.in);
   int idade = 0;
   int media = 0;
  
   System.out.println("Digite a idade de 20 pessoas: ");
   
   for (int i = 0; i < 20; i++)  {
	   idade = entrada.nextInt();
       media += idade / 20;
   }
	
   if (media >= 0 && media <= 25) {
		System.out.println("A turma é jovem...");
   }
		else {	
		if (media >= 26 && media <= 60 ) {
			System.out.println("A turma é adulta...");
		}
		
		else {
			System.out.println("A turma é idosa... ");
		}
		
		
		
		}
	}
}    */
//-------------------------------------------------------------------------------
/*package atividade;
import java.util.Random;
import java.util.Scanner;
public class ListaEstruturaDeRepetição2_30102020 {

public static void main(String[] args) {
		//11.	Colocar estas duas linhas iniciais no método Main(): 
			//Random rnd = new Random(); 
			//Inicia Aleatório int x = rnd.nextInt(100); 
			//Gera um número aleatório (0 – 99) 
			//a)	Faça um laço de repetição que solicite ao usuário digitar um número;
			//b)	O laço encerra quando o usuário acertar o número; 
			//c)	Se o número do usuário for menor que o oculto, escrever: “MAIOR”, se o número do usuário for maior que o oculto, escrever: “MENOR”.

	Random rnd = new Random();
	int x = rnd.nextInt(100);
	
	System.out.println(x);
	
	Scanner entrada = new Scanner(System.in);
    
	int numero = 0;

   while(numero != x) {
		System.out.println("Digite número: ");
	    numero = entrada.nextInt();
	
	  if (numero < x) {
		  System.out.println("MAIOR");
	  }
	  else {
		  if (numero > x) {
			  System.out.println("MENOR");
		  }
		  else {
				  System.out.println("ACERTOU !" + " Era: " + x );
			  }
		  }
	  }
	}

}    */
