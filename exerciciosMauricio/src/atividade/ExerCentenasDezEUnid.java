package atividade;
import java.util.Scanner;
public class ExerCentenasDezEUnid {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um número de 1 a 999: ");
	Integer numero = entrada.nextInt();
	
	if (numero > 0 && numero <1000) {
		 if (numero/100 >= 1) {
	       System.out.println("Centenas: " + (numero/100));
		 }
	  
		 numero = numero - (numero/ 100) * 100;
	  
	     if (numero/10 >= 1) {
	    	 System.out.println("Dezenas: " +(numero/10));
	     }
	  
	     numero = numero - (numero/ 10) * 10;
	     
	     System.out.println("unidades: " + numero);
}
	}
}