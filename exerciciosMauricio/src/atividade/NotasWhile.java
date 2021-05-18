package atividade;

import java.util.Scanner;

public class NotasWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int nota = 0;
		int soma = 0;

		while (nota != -1) {
			System.out.println("Digite a nota: ");
			nota = entrada.nextInt();
			soma += nota;

		}

		System.out.println("Total:  " + soma);

	}

}
