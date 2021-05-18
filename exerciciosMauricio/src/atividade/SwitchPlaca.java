package atividade;
import java.util.Scanner;
public class SwitchPlaca {

	public static void main(String[] args) {
	  
	Scanner entrada = new Scanner(System.in);	
		
	 System.out.println("Digite o número da placa");
	 String placa = entrada.next();
	 
	 char dia = placa.charAt(6);
	 
	 switch (dia) {
	 case '0' :
		 System.out.println("O prazo de renovação é dezembro");break;
	
	 case '1' :
		 System.out.println("O prazo de renovação é janeiro");break;
	 
	 case '2' :
		 System.out.println("O prazo de renovação é fevereiro");break;
	 
	 case '3' :
		 System.out.println("O prazo de renovação é março");break;
	 
	 case '4' :
		 System.out.println("O prazo de renovação é abril");break;
	 
	 case '5' :
		 System.out.println("O prazo de renovação é maio");break;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
	  
	 
	

	
	}

}
