package atividade;
import java.util.Scanner;
public class ExercicioDoWhile {

	public static void main(String[] args) {
	
	   
	Scanner entrada = new Scanner(System.in);
	int opcao = 0;
	
	
	
		do {
			System.out.println("Digite dois n�meros: ");
	        int num1 = entrada.nextInt(); int num2 = entrada.nextInt();
			
	        System.out.println("1- soma, 2- subtra��o, 3- Multiplica��o 4- divis�o, 0 - sair");
			opcao = entrada.nextInt();
	   
            switch (opcao) {
            case 1:
              System.out.println(num1 + num2);break;
            case 2: 
            	System.out.println(num1 - num2);break;
            case 3: 
            	System.out.println(num1 * num2);break;
            case 4:
            	System.out.println(num1 / num2);break;
            case 0:
            System.out.println("vlw, Obrigado pela aten��o...");break;
          
            default:
            	System.out.println("N�mero indispon�vel");break;
            	
            }
		} while (opcao != 0);  
		System.out.println("Obrigado por utilizar nosso sistema!");
		
	}
}

	
