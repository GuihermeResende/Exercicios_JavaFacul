package atividade;

import java.util.Scanner;
public class DesafioDaConeversao {
	public static void main(String[] args) {
		
   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Digite o seu salário");
   String salario = entrada.nextLine().replace(",",".");
  

   System.out.println("Digite o seu salário");
   String salario2 = entrada.nextLine().replace(",",".");
  
   
   System.out.println("Digite o seu salário");
   String salario3 =  entrada.nextLine().replace(",",".");
   
   

    Double salarioD = Double.parseDouble(salario);
    Double salarioD2 = Double.parseDouble(salario);
    Double salarioD3 = Double.parseDouble(salario3);
    
    double media = (salarioD + salarioD2 + salarioD3) /3;
    
    System.out.println("A média do salário é:" + media);
    	
    
   
	
	}
	            

}
