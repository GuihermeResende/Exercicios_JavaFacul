package atividade;
import java.util.Scanner;
import java.util.Random;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Random rnd=  new Random();  
        int x = rnd.nextInt(100); // pega números aleatórios entre 0 e 99   ( BINGO KKKKK)
	
     int palpite = 0; int tentativa = 0;
       System.out.println(x);   
      
      while (x != palpite ) {
          System.out.println("Digite um número: ");
    	  palpite = entrada.nextInt();
    	  
      if (palpite < x ) {
         System.out.println("MENOR");
	}
        else {
        	if (palpite > x) {
        		System.out.println("MAIOR");
        	}
        	else {
        		
         tentativa ++;
         
        	}
        	System.out.println(palpite + " BOAA GAROTO !!" + tentativa + "Tentativas");
        }
}
	}
}