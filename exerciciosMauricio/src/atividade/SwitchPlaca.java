package atividade;
import java.util.Scanner;
public class SwitchPlaca {

	public static void main(String[] args) {
	  
	Scanner entrada = new Scanner(System.in);	
		
	 System.out.println("Digite o n�mero da placa");
	 String placa = entrada.next();
	 
	 char dia = placa.charAt(6);
	 
	 switch (dia) {
	 case '0' :
		 System.out.println("O prazo de renova��o � dezembro");break;
	
	 case '1' :
		 System.out.println("O prazo de renova��o � janeiro");break;
	 
	 case '2' :
		 System.out.println("O prazo de renova��o � fevereiro");break;
	 
	 case '3' :
		 System.out.println("O prazo de renova��o � mar�o");break;
	 
	 case '4' :
		 System.out.println("O prazo de renova��o � abril");break;
	 
	 case '5' :
		 System.out.println("O prazo de renova��o � maio");break;
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
	  
	 
	

	
	}

}
