/*package atividade;

import java.util.Scanner;

public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {
		
		// 1. Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		Double Numero1 = entrada.nextDouble();

		System.out.println("Digite o segundo n�mero: ");
		Double Numero2 = entrada.nextDouble();

		System.out.println("Digite o terceiro n�mero: ");
		Double Numero3 = entrada.nextDouble();
		
		   if (Numero1 > Numero2 && Numero1 > Numero3) {
	       System.out.println("O maior n�mero �: " + Numero1);
		}
        
        else
		  if(Numero2 > Numero1 && Numero2 > Numero3) {
				System.out.println("O maior n�mero �: " + Numero2);
        }
	      else
		     if(Numero3 > Numero2 && Numero3 > Numero1) {
			    System.out.println("O maior n�mero �: " + Numero3);
		    
	   	}
	}
} */
//----------------------------------------------------------------------------------------------------------

/*package atividade;
import javax.swing.JOptionPane;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {
		//2.	Elabore um programa que receba dois n�meros inteiros e mostre para o usu�rio um menu com as op��es: 
		    //1 � Soma    
			//2 � Subtra��o 
			//3 � Divis�o 
			//4 � Multiplica��o 
			//E fa�a a opera��o desejada pelo usu�rio.

		String Valor1 = JOptionPane.showInputDialog("Digite um n�mero inteiro: ");
		String Valor2 = JOptionPane.showInputDialog("Digite mais um n�mero inteiro: ");
		String Operadores = JOptionPane.showInputDialog("Escolha um operador:  \n" +      
		        "           1 � Soma    \n" + 
				"			2 � Subtra��o \n" + 
				"			3 � Divis�o \n" + 
				"			4 � Multiplica��o \n");
	
		  Double Numero1 = Double.parseDouble(Valor1);
	      Double Numero2 = Double.parseDouble(Valor2);
	      
	      if (Operadores.contentEquals("1")) {
	      System.out.println(Numero1 + Numero2);
		}
		
	     else
		    if (Operadores.contentEquals("2")) {
			System.out.println(Numero1 - Numero2);
		  }
		    else
		    	if(Operadores.contentEquals("3")) {
		    	System.out.println(Numero1 / Numero2);
		    	}
		    	else
		    		if(Operadores.contentEquals("4"))
	               System.out.println(Numero1 * Numero2);
	
	}
}  */
//--------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {


//3.	Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
	
		Scanner entrada = new Scanner(System.in);
		
    System.out.println("Digite o primeiro n�mero");
	Double Num1 = entrada.nextDouble();
	
	System.out.println("Digite o segundo n�mero");
	Double Num2 = entrada.nextDouble();
	
	System.out.println("Digite o terceiro n�mero");
	Double Num3 = entrada.nextDouble();
	
	if (Num1 > Num2 && Num1 > Num3) {
	System.out.println("Maior: " + Num1);
	}
	
	if (Num2 > Num1 && Num2 > Num3) {
	System.out.println("Maior: " + Num2);
	}
	
	if (Num3 > Num1 && Num3 > Num2) {
	System.out.println("Maior: " + Num3);
	}
	
    if (Num1 < Num2 && Num1 < Num3) {
	System.out.println("Menor: " + Num1);
    }
	
    if (Num2 < Num1 && Num2 < Num3) {
    System.out.println("Menor: " + Num2);
    }
	
	if (Num3 < Num1 && Num3 < Num2) {
	System.out.println("Menor: " + Num3);
	}
	
}
  } */
//--------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {
	//4.	Em uma f�brica, uma m�quina precisa de manuten��o sempre que o n�mero de pe�as defeituosas supera 10% da produ��o. Dados o total de pe�as produzidas e o total de pe�as defeituosas, informe se a m�quina precisa de manuten��o.
		
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o total de pe�as produzidas: ");
	Double PecasProduzidas = entrada.nextDouble();
    
    System.out.println("Digite o total de pe�as defeituosas: ");
	Double PecasDefeituosas = entrada.nextDouble();
    
	Double Producao = (PecasProduzidas * 10 / 100);
	
	if (PecasDefeituosas > Producao) {
		System.out.println("A m�quina necessita de manuten��o..");
	}
	else System.out.println("A m�quina est� em ordem..");
   
	}
	
} */

//--------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {
//5.	Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, sabendo que a decis�o � sempre pelo mais barato.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro produto: ");
		Double Valor1 = entrada.nextDouble();
		
		System.out.println("Digite o valor do segundo produto: ");
		Double Valor2 = entrada.nextDouble();
		
		System.out.println("Digite o valor do terceiro produto: ");
		Double Valor3 = entrada.nextDouble();
		
    if (Valor1 < Valor2 && Valor1 < Valor3) {
		System.out.println("O melhor produto � o primeiro: ");
	}		
    else	
	if (Valor2 < Valor1 && Valor2 < Valor3) {
		System.out.println("O melhor produto � o segundo");
	}	
	else
	if(Valor3 < Valor1 && Valor3 < Valor2)
	  System.out.println("O melhor produto � o terceiro");
		
		}
}   */

//-------------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {

//6.	Fa�a um Programa que pergunte em que turno voc� estuda. Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inv�lido!", conforme o caso.

     Scanner entrada = new Scanner(System.in);
     
     System.out.println("Digite o per�odo que voc� estuda: \n "
     		+ "M-matutino, V-Vespertino ou N- Noturno ?");
     String Periodo = entrada.next();
     
     if (Periodo.equalsIgnoreCase("M")) {
		System.out.println("Bom dia!");
	}
     else
     if (Periodo.equalsIgnoreCase("V")) {
		System.out.println("Boa tarde!");
	}
     else 
    if (Periodo.equalsIgnoreCase("N")) {
		System.out.println("Boa noite!");
	}
     
    else {
    	System.out.println("Valor Inv�lido!");
    }
    	
     
     
     
	}
	
}  */
//--------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {
    
		//7.	Em uma papelaria, at� 100 folhas, a c�pia custa R$0,25, e acima de 100 folhas custa R$0,20. Dado o total de c�pias, informe o total a ser pago.
    
		Scanner entrada = new Scanner(System.in);
        
		System.out.println("Digite quantas c�pias voc� gostaria: ");
		Integer Folhas = entrada.nextInt();
		
		Double Valor100Folhas = (Folhas * 0.25);
		Double ValorMais100Folhas = (Folhas * 0.20);
		 
		if (Folhas <= 100) {
			System.out.println("O total a ser pago �: " + Valor100Folhas + " Reais" );
		}
		else
		 if (Folhas > 100) {
			 System.out.println("O total a ser pago �: " + ValorMais100Folhas + " Reais");
		 }
	}
}   */
//--------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {

//8.	Crie um programa que receba o valor de total de venda de um pedido. E Caso o pagamento for a vista (Desconto de 5%), se pagamento for Cart�o D�bito (Valor sem desconto), se pagamento for em Cheque (Acr�scimo de 10%).
		
   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Digite o valor da venda: ");
   Double ValorVenda = entrada.nextDouble();
   
   System.out.println("Digite a forma de pagamento 1- Dinheiro � vista, 2- Cart�o de d�bito ou 3- Cheque");
   String Pagamento = entrada.next();
   
   if (Pagamento.equalsIgnoreCase("1")) {
	   Double Desconto = ValorVenda - 5% ValorVenda;
	   System.out.println("Valor total R$" + Desconto);
}
   else
	   if(Pagamento.equalsIgnoreCase("2")) {
		  System.out.println("Valor total R$" + ValorVenda);
	   }
	   else
		   if(Pagamento.equalsIgnoreCase("3")) {
			  Double Acrescimo = ValorVenda + 10% ValorVenda;
			  System.out.println("Valor total R$" + Acrescimo);
		   }
   }
}    */

//----------------------------------------------------------------------------------------------------------------------------------
 /*package atividade;
  import java.util.Scanner;
  public class Lista2ExerciciosCondicionais07102020 {

   	public static void main(String[] args) {

   
   // 9.	A Loja Mam�o com A��car est� vendendo seus produtos em 5 (cinco) presta��es sem juros para compras acima de R$250,00. Fa�a um algoritmo que receba um valor de uma compra e mostre o valor das presta��es se poss�vel
		
	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite o valor da sua compra: ");
	Double Valor = entrada.nextDouble();
	
	if (Valor > 250) {
		double Parcelamento = Valor / 5;
		System.out.println("A sua parcela � de: " + Parcelamento);
	}
	else System.out.println(Valor);		
	}
}   */
//------------------------------------------------------------------------------------------------------------
  /*package atividade;
  import java.util.Scanner;
  public class Lista2ExerciciosCondicionais07102020 {

   	public static void main(String[] args) {



//10.	Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores podem ser um tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
//o	Dicas:
//o	Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
//o	Tri�ngulo Equil�tero: tr�s lados iguais;
//o	Tri�ngulo Is�sceles: quaisquer dois lados iguais;
//o	Tri�ngulo Escaleno: tr�s lados diferentes;

   	Scanner entrada = new Scanner(System.in);
   	
   	System.out.println("Digite o valor dos 3 lados do tri�ngulo: ");
   	Integer Lado1 = entrada.nextInt();Integer Lado2 = entrada.nextInt(); Integer Lado3 = entrada.nextInt();
   	     
   	if (Lado1 == Lado2 && Lado2 == Lado3 && Lado1 == Lado3) {
		System.out.println("� um trin�ngulo Equil�tero");
   	}
	else
   	    if (Lado1 == Lado2 || Lado1 == Lado3 || Lado2 == Lado3) {
		System.out.println("� um tri�ngulo Is�sceles");
   	}
   	  else 
        if (Lado1 != Lado2 && Lado1 != Lado3 && Lado2 != Lado3) {
			System.out.println("� um tri�ngulo Escaleno");
	    }
   	
  }
  } */