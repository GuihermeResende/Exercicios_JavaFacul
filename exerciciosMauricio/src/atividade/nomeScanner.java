package atividade;

import java.util.Scanner;

public class nomeScanner {
 public static void main(String[] args) {
	


  Scanner entrada = new Scanner(System.in);
  
  System.out.println("Digite seu nome e sobrenome: ");
  String nome = entrada.nextLine();
  
  System.out.println(nome.toUpperCase()); //nome em mai�sculo
  System.out.println(nome.charAt(4));     //letra na posi��o 4
  System.out.println(nome.replace("e","$")); //substitui 
  
  entrada.close();
  
  
  


 
 
 
 }
	
	
	
	
	
	
}
