package atividade;
import java.util.Scanner;
public class ExercicioMaiorNumeroInt {

	public static void main(String[] args) {
		
     Scanner entrada = new Scanner(System.in);
     
     System.out.println("Digite um número");
	 double numero1 = entrada.nextDouble();
	 
	 System.out.println("Digite um número");
	 double numero2 = entrada.nextDouble();
	 
	 System.out.println("Digite um número");
	 double numero3 = entrada.nextDouble();
	 
	if (numero1 > numero2) {
		System.out.println(numero1);
	}
	
	else 
		if (numero2 > numero1) {
			System.out.println(numero2);
		}
	else
	   if (numero3 > numero2 && numero3 > numero1) {
		   System.out.println(numero3);
	   }
	
	}

}
