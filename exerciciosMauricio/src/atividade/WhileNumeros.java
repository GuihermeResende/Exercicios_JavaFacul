package atividade;

import java.util.Scanner;

public class WhileNumeros {

	public static void main(String[] args) {
		// escreva um algorítimo que leia 20 valores inteiros e ao final exiba:
		// a) a soma dos números positivos b)A quantidade de valores negativos

		Scanner entrada = new Scanner(System.in);
		Integer valores = 0;

		System.out.println("Digite 20 valores: ");
		int soma = 0;
		int numerosPositivos = 0;
		int quantNegativos = 0;

		while (valores < 20) {
			int a = entrada.nextInt();
			valores++;

			if (a >= 0) {
				numerosPositivos = a;
				soma += numerosPositivos;
				System.out.println("A soma dos numeros positivos é: " + soma);
			}

			else
				if (a < 0) {
				  quantNegativos = a;
				  System.out.println("Números Negativos: " + quantNegativos);
				}
		
		
		}

	}

}
