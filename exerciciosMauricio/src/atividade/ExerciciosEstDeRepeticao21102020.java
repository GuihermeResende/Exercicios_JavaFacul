/*package atividade;
import java.util.Scanner;
public class ExerciciosEstDeRepeticao21102020 {

	public static void main(String[] args) {
		// 1. Escreva um algoritmo que leia 20 valores inteiros e ao final exiba:
		// a) a soma dos n�meros positivos;
		// b) a quantidade de valores negativos

		Scanner entrada = new Scanner(System.in);
		int i = 0;

		int soma = 0;
		int somaNumeros = 0;
		int quantNegativos = 0;

		System.out.println("Digite 20 n�meros Inteiros: ");

		while (i < 20) {
			int valores = entrada.nextInt();
			
            if (valores >= 0) {
				soma += valores;
			}

			else {
				quantNegativos++;

				}
			i++;
		}
		System.out.println("A soma dos n�meros positivos �: " + soma);
		System.out.println("A quantidade de n�meros negativos �: " + quantNegativos);
	}
}     */
//-------------------------------------------------------------------------------------------------

  /*package atividade;
  import java.util.Scanner;
  public class ExerciciosEstDeRepeticao21102020 {
  
  public static void main(String[] args) {
  
  // 2. Escrever um programa de computador que leia 10 n�meros inteiros e, ao
  // final, apresente a soma de todos os n�meros lidos
 
  
  Scanner entrada = new Scanner(System.in); 
  int valores = 0; int soma = 0;
  
  System.out.println("Digite 10 n�meros: ");
  
  while (valores < 10) { 
  int a = entrada.nextInt(); valores++;
  soma += a; 
  
           }
  System.out.println("A soma de todos os n�meros �: " + soma);
      }   
  }  */
 
//---------------------------------------------------------------------------------------------------------
 /*package atividade; 
import java.util.Scanner; 
public class ExerciciosEstDeRepeticao21102020 {

public static void main(String[] args) {

// 3. Escreva um programa que leia um valor correspondente ao n�mero de //
//jogadores de um time de v�lei. O programa dever� ler uma altura para cada um
// dos jogadores e, ao final, informar a altura m�dia do time

Scanner entrada = new Scanner(System.in);

System.out.println("Digite o n�mero de integrantes do time: ");
int numIntegrantes = entrada.nextInt();

System.out.println("Digite a altura dos 6 jogadores: ");


int i = 0; float media = 0;


while (i < numIntegrantes) { 
float tamanho = entrada.nextFloat(); 
i ++; 
media += tamanho / numIntegrantes;

           }

System.out.println("A m�dia da altura dos integrates do time �: " + media); 
    }
}     */

//---------------------------------------------------------------------------------------------------
/* package atividade; 
import java.util.Scanner; 
public class
  ExerciciosEstDeRepeticao21102020 {
  
  public static void main(String[] args) { 
  //4. Digitados dois n�meros (base e expoente), calcule o resultado utilizando apenas multiplica��es;
  
  Scanner entrada = new Scanner(System.in);

  int calculo = 0;
  int i = 1;
  
  System.out.println("Digite uma base: ");
  int base = entrada.nextInt();
  
 System.out.println("Digite um expoente: ");
 int expoente = entrada.nextInt();
 
 calculo = base;
 while (i < expoente) {
	 calculo = calculo * base;
   i++;
 }
  System.out.println("total = " + base + "^" + expoente +" =" + calculo);
  
  
  }
}    */

//---------------------------------------------------------------------------------------------------------------	

/*  package atividade;
  import javax.swing.JOptionPane;
  public class ExerciciosEstDeRepeticao21102020 {
  
  public static void main(String[] args) {
  
  // 5.Fa�a um programa que s� saia quando o usu�rio escolher a op��o de //
  //sa�da.Exemplo: Programa de soma e subtra��o.
 
 
  
  String saida = JOptionPane.showInputDialog("digite 0 para sair");
 
  while (saida != "0") { 
  String valor1 = JOptionPane.showInputDialog("Digite o primeiro valor para o c�lculo"); 
  String valor2 = JOptionPane.showInputDialog("Digite o segundo valor para o c�lculo");
  
  Double valor1Double = Double.parseDouble(valor1);
  Double valor2Double = Double.parseDouble(valor2);
   
  
   if (saida != "sa�da") { 
  System.out.println("Soma: " + (valor1Double + valor2Double));
  System.out.println("Subtra��o: " + (valor1Double - valor2Double));
  
   }
  
  }
  }
  }   */
 
//------------------------------------------------------------------------------
/*package atividade;

import java.util.Scanner;

public class ExerciciosEstDeRepeticao21102020 {

	public static void main(String[] args) {

		// 6. Fa�a o mesmo que antes, por�m, ao inv�s de ler 10 n�meros, o programa
		// dever� ler e somar n�meros at� que o valor digitado seja zero ( 0 ).

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite n�meros inteiros: ");

		int i = 1;
		int soma = 0;

		while (i > 0) {
			int numeros = entrada.nextInt();
			i++;

			if (numeros != 0) {
				soma += numeros;
				System.out.println("Soma dos n�meros: " + soma);
				}
			}
				
	  }

}     */
//--------------------------------------------------------------------------------------------------------------------

/* package atividade; import java.util.Scanner; public class
  ExerciciosEstDeRepeticao21102020 {
  
  public static void main(String[] args) { //7. Fa�a um algoritmo que escreva
  na tela os n�meros de um n�mero inicial a um n�mero final. E mostre a
  quantidade de n�meros pares e quantidade de n�meros �mpares.
  
  Scanner entrada = new Scanner(System.in);
  
  System.out.println("Digite um n�mero inicial e um final...");
  
  int NumInicial = entrada.nextInt(); int Numfinal = entrada.nextInt();
  
  while (NumInicial < Numfinal) { NumInicial++; System.out.println(NumInicial);
  
  if (NumInicial % 2 == 0) { System.out.println(NumInicial + "= PAR"); }
 
  else System.out.println(NumInicial + "= �MPAR");
  
  }
  
  }
 
  }     
 */

//--------------------------------------------------------------------------------------------------

 /*package atividade; 
 import java.util.Scanner; 
 public class ExerciciosEstDeRepeticao21102020 { public static void main(String[] args) {
  
  // 8. Elabore um programa que receba 5 n�meros e imprima somente os positivos.
  
  Scanner entrada = new Scanner(System.in);
  
  System.out.println("Digite 5 n�meros: ");
  
  int i = 0;
  
  while (i < 5){ 
	  int a = entrada.nextInt(); 
	  i++;
  
  if (a > 0) { 
	  System.out.println( " N�mero positivo"); }
  
  }
  
  }
  
 }  */
 
//--------------------------------------------------------------------------------------------------

/*package atividade;
import java.util.Scanner;
public class ExerciciosEstDeRepeticao21102020 {
	public static void main(String[] args) {

		// 9. Elabore um programa que receba o nome e 4 notas de 10 alunos, calcule e
		// exiba o resultado da m�dia na tela utilizando a estrutura de repeti��o.

		Scanner entrada = new Scanner(System.in);

		int i = 1;
		while (i <= 10) {
			System.out.println("Digite o nome e as notas dos 4 alunos");
			String nome = entrada.next();
			int nota1 = entrada.nextInt();
			int nota2 = entrada.nextInt();
			int nota3 = entrada.nextInt();
			int nota4 = entrada.nextInt();
			float media = (nota1 + nota2 + nota3 + nota4) / 4;
			i++;

			System.out.println("M�dia: " + media);
		}

	}

 }  */

// ----------------------------------------------------------------------------------------------------------------
 /*package atividade; 
  import java.util.Scanner; 
  public class ExerciciosEstDeRepeticao21102020 { public static void main(String[] args) {
  
  //10.	Escreva um programa que lido um n�mero, calcule e informe o seu fatorial. 
  //Ex.: 5! = 5 * 4 * 3 * 2 * 1 = 120.

  Scanner entrada = new Scanner(System.in);
  
  int total = 1; int i = 1;
  
  System.out.println("Digite um fatorial: ");
  int fatorial = entrada.nextInt();
  
  System.out.print(fatorial + "!=");
  
  
  while(i <= fatorial) {
  
  System.out.print(fatorial + "*"); total *= fatorial; fatorial --; }
  
  System.out.print("=" + total);
  
  }
  
 }  */  
 
