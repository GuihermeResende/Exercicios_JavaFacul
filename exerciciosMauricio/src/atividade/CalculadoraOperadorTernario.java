package atividade;
import java.util.Scanner;
public class CalculadoraOperadorTernario {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o operador: ");
    String operador = entrada.nextLine();
	
    System.out.println("Digite um número: ");
    Double Numero1 = entrada.nextDouble(); 
    
    System.out.println("Digite outro número: ");
    Double Numero2 = entrada.nextDouble(); 
    
    System.out.println(operador.equals("+") ? Numero1 + Numero2 : 0);
	System.out.println(operador.equals("-") ? Numero1 - Numero2 : 0);
	System.out.println(operador.equals("*") ? Numero1 * Numero2 : 0);
	System.out.println(operador.equals("/") ? Numero1 / Numero2 : 0);
	System.out.println(operador.equals("%") ? Numero1 % Numero2 : 0);
    
    

	
	}

}
