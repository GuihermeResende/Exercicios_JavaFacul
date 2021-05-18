package atividade;
import java.util.Scanner;
public class ExercicioNumeros {

	public static void main(String[] args) {
		
	   Scanner entrada = new Scanner(System.in);
      
	  System.out.println("Digite dois números inteiros e um real: ");
	  Integer Numero1 = entrada.nextInt(); Integer Numero2 = entrada.nextInt(); Double Numero3 = entrada.nextDouble();
	  
	  Integer Calculo1 = (Numero1 * 2) * (Numero2 / 2) ;
	  Double Calculo2 = (Numero1 * 3) + (Numero3);
	  Double Calculo3 = Math.pow(Numero3, 3);
	
	  System.out.println("A)" + Calculo1);
	  System.out.println("B)" + Calculo2);
	  System.out.println("C)" + Calculo3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
