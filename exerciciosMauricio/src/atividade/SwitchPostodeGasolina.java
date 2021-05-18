package atividade;

import java.util.Scanner;

public class SwitchPostodeGasolina {

	public static void main(String[] args) {
		/*
		 * Um posto est� vendendo combust�veis com a seguinte tabela de descontos: o
		 * �lcool: o at� 20 litros, desconto de 3% por litro o acima de 20 litros,
		 * desconto de 5% por litro o Gasolina: o at� 20 litros, desconto de 4% por
		 * litro o acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que
		 * leia o n�mero de litros vendidos, o tipo de combust�vel (codificado da
		 * seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago
		 * pelo cliente sabendo-se que o pre�o do litro da gasolina � R$ 4,50 o pre�o do
		 * litro do �lcool � R$ 2,90.
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o tipo de combust�vel: A- �lcool ou G- gasolina: ");
		String combustivel = entrada.next().toUpperCase();

		switch (combustivel) {
		case "A":
			System.out.println("Digite quantos litros voc� gostaria: ");
			Double LitrosAlcool = entrada.nextDouble();
			Double TotalA = 2.90 * LitrosAlcool;

			if (LitrosAlcool <= 20) {
				System.out.println(TotalA - 3 * TotalA / 100);
			} else if (LitrosAlcool > 20) {
				System.out.println(TotalA - 5 * TotalA / 100);
			}
			break;

		case "G":
			System.out.println("Digite quantos litros voc� gostaria:");
			Double LitrosGasolina = entrada.nextDouble();
			Double TotalG = 4.50 * LitrosGasolina;

			if (LitrosGasolina <= 20) {
				System.out.println(TotalG - (4 * TotalG / 100));
			} else if (LitrosGasolina > 20) {
				System.out.println(TotalG - (6 * TotalG / 100));
			}
			break;
		}

	}

}
