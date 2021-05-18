package atividade;


import java.util.Scanner;
class Calculadora {
 
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número");
		Float numero1 = entrada.nextFloat();
		
		System.out.println("Digite outro número");
		Float numero2 = entrada.nextFloat();
		
		float soma  = numero1 + numero2;
		
		float subtracao = numero1 - numero2;
		float multiplicacao= numero1 * numero2;
		float divisao = numero1 / numero2;

		System.out.printf(" %s. %s. %s, %s" , soma, subtracao, multiplicacao, divisao);
	}

}
