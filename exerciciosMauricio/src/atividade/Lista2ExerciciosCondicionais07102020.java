/*package atividade;

import java.util.Scanner;

public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {
		
		// 1. Faça um Programa que leia três números e mostre o maior deles.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		Double Numero1 = entrada.nextDouble();

		System.out.println("Digite o segundo número: ");
		Double Numero2 = entrada.nextDouble();

		System.out.println("Digite o terceiro número: ");
		Double Numero3 = entrada.nextDouble();
		
		   if (Numero1 > Numero2 && Numero1 > Numero3) {
	       System.out.println("O maior número é: " + Numero1);
		}
        
        else
		  if(Numero2 > Numero1 && Numero2 > Numero3) {
				System.out.println("O maior número é: " + Numero2);
        }
	      else
		     if(Numero3 > Numero2 && Numero3 > Numero1) {
			    System.out.println("O maior número é: " + Numero3);
		    
	   	}
	}
} */
//----------------------------------------------------------------------------------------------------------

/*package atividade;
import javax.swing.JOptionPane;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {
		//2.	Elabore um programa que receba dois números inteiros e mostre para o usuário um menu com as opções: 
		    //1 – Soma    
			//2 – Subtração 
			//3 – Divisão 
			//4 – Multiplicação 
			//E faça a operação desejada pelo usuário.

		String Valor1 = JOptionPane.showInputDialog("Digite um número inteiro: ");
		String Valor2 = JOptionPane.showInputDialog("Digite mais um número inteiro: ");
		String Operadores = JOptionPane.showInputDialog("Escolha um operador:  \n" +      
		        "           1 – Soma    \n" + 
				"			2 – Subtração \n" + 
				"			3 – Divisão \n" + 
				"			4 – Multiplicação \n");
	
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


//3.	Faça um Programa que leia três números e mostre o maior e o menor deles.
	
		Scanner entrada = new Scanner(System.in);
		
    System.out.println("Digite o primeiro número");
	Double Num1 = entrada.nextDouble();
	
	System.out.println("Digite o segundo número");
	Double Num2 = entrada.nextDouble();
	
	System.out.println("Digite o terceiro número");
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
	//4.	Em uma fábrica, uma máquina precisa de manutenção sempre que o número de peças defeituosas supera 10% da produção. Dados o total de peças produzidas e o total de peças defeituosas, informe se a máquina precisa de manutenção.
		
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o total de peças produzidas: ");
	Double PecasProduzidas = entrada.nextDouble();
    
    System.out.println("Digite o total de peças defeituosas: ");
	Double PecasDefeituosas = entrada.nextDouble();
    
	Double Producao = (PecasProduzidas * 10 / 100);
	
	if (PecasDefeituosas > Producao) {
		System.out.println("A máquina necessita de manutenção..");
	}
	else System.out.println("A máquina está em ordem..");
   
	}
	
} */

//--------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {
//5.	Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro produto: ");
		Double Valor1 = entrada.nextDouble();
		
		System.out.println("Digite o valor do segundo produto: ");
		Double Valor2 = entrada.nextDouble();
		
		System.out.println("Digite o valor do terceiro produto: ");
		Double Valor3 = entrada.nextDouble();
		
    if (Valor1 < Valor2 && Valor1 < Valor3) {
		System.out.println("O melhor produto é o primeiro: ");
	}		
    else	
	if (Valor2 < Valor1 && Valor2 < Valor3) {
		System.out.println("O melhor produto é o segundo");
	}	
	else
	if(Valor3 < Valor1 && Valor3 < Valor2)
	  System.out.println("O melhor produto é o terceiro");
		
		}
}   */

//-------------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {

//6.	Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

     Scanner entrada = new Scanner(System.in);
     
     System.out.println("Digite o período que você estuda: \n "
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
    	System.out.println("Valor Inválido!");
    }
    	
     
     
     
	}
	
}  */
//--------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {
    
		//7.	Em uma papelaria, até 100 folhas, a cópia custa R$0,25, e acima de 100 folhas custa R$0,20. Dado o total de cópias, informe o total a ser pago.
    
		Scanner entrada = new Scanner(System.in);
        
		System.out.println("Digite quantas cópias você gostaria: ");
		Integer Folhas = entrada.nextInt();
		
		Double Valor100Folhas = (Folhas * 0.25);
		Double ValorMais100Folhas = (Folhas * 0.20);
		 
		if (Folhas <= 100) {
			System.out.println("O total a ser pago é: " + Valor100Folhas + " Reais" );
		}
		else
		 if (Folhas > 100) {
			 System.out.println("O total a ser pago é: " + ValorMais100Folhas + " Reais");
		 }
	}
}   */
//--------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class Lista2ExerciciosCondicionais07102020 {

	public static void main(String[] args) {

//8.	Crie um programa que receba o valor de total de venda de um pedido. E Caso o pagamento for a vista (Desconto de 5%), se pagamento for Cartão Débito (Valor sem desconto), se pagamento for em Cheque (Acréscimo de 10%).
		
   Scanner entrada = new Scanner(System.in);
   
   System.out.println("Digite o valor da venda: ");
   Double ValorVenda = entrada.nextDouble();
   
   System.out.println("Digite a forma de pagamento 1- Dinheiro à vista, 2- Cartão de débito ou 3- Cheque");
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

   
   // 9.	A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros para compras acima de R$250,00. Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações se possível
		
	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite o valor da sua compra: ");
	Double Valor = entrada.nextDouble();
	
	if (Valor > 250) {
		double Parcelamento = Valor / 5;
		System.out.println("A sua parcela é de: " + Parcelamento);
	}
	else System.out.println(Valor);		
	}
}   */
//------------------------------------------------------------------------------------------------------------
  /*package atividade;
  import java.util.Scanner;
  public class Lista2ExerciciosCondicionais07102020 {

   	public static void main(String[] args) {



//10.	Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
//o	Dicas:
//o	Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
//o	Triângulo Equilátero: três lados iguais;
//o	Triângulo Isósceles: quaisquer dois lados iguais;
//o	Triângulo Escaleno: três lados diferentes;

   	Scanner entrada = new Scanner(System.in);
   	
   	System.out.println("Digite o valor dos 3 lados do triângulo: ");
   	Integer Lado1 = entrada.nextInt();Integer Lado2 = entrada.nextInt(); Integer Lado3 = entrada.nextInt();
   	     
   	if (Lado1 == Lado2 && Lado2 == Lado3 && Lado1 == Lado3) {
		System.out.println("É um trinãngulo Equilátero");
   	}
	else
   	    if (Lado1 == Lado2 || Lado1 == Lado3 || Lado2 == Lado3) {
		System.out.println("É um triângulo Isósceles");
   	}
   	  else 
        if (Lado1 != Lado2 && Lado1 != Lado3 && Lado2 != Lado3) {
			System.out.println("É um triângulo Escaleno");
	    }
   	
  }
  } */