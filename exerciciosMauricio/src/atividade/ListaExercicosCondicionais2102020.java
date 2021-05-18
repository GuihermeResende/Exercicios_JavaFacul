/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

	public static void main(String[] args) {
		//1.	Faça um Programa que peça dois números e imprima o maior deles.	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	Double numero1 = entrada.nextDouble();
	
	System.out.println("Digite um segundo número");
	Double numero2 = entrada.nextDouble();
	
	if (numero1 > numero2) {
		System.out.println(numero1);
	}
	
	else {
		System.out.println(numero2);
	}
		
	}

}   */

//------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	//2.	Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
	
	System.out.println("Digite um número: ");
	double Numero = entrada.nextDouble();
	
	if (Numero < 0) {
		System.out.println("Número negativo..");
	}
	
	else {
		System.out.println("Número positivo..");
	} 
	
   }
 }  */

//-------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

	public static void main(String[] args) {
    
		//3.Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10
		
	Scanner entrada = new Scanner(System.in);
    
	System.out.println("Digite um número: ");
    double Numero = entrada.nextDouble();
    
    if (Numero > 10) {
		System.out.println("Número maior que 10");
	}
		
		
}
   }  */

//-------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

	public static void main(String[] args) {
		
		//4.	Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido	
		
	Scanner entrada = new Scanner(System.in);
		
	System.out.println("Digite a letra do sexo: ");
	String letra = entrada.nextLine();
	
	    if (letra.equalsIgnoreCase("F")) {
		System.out.println("Feminino");
	}
		
	else
		if (letra.equalsIgnoreCase("M")) {
		System.out.println("Masculino");
		}
		
	else {
		System.out.println("Sexo inválido");
	}
		
}	
	}  */
//-------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

	public static void main(String[] args) {

     //5. Dada a idade de um nadador, informe, informe a sua categoria: Infantil (até 10 anos), Juvenil (até 17 anos) ou Sênior (acima de 17 anos)
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a sua idade: ");
	Integer idade = entrada.nextInt();
	
	    if (idade <= 10) {
		System.out.println("Categoria: infantil");
	}
		
	else
		if (idade > 10 && idade <= 17) {
			System.out.println("Categoria: Juvenil");
		}
		
		else
			System.out.println("Categoria: Sênior");
		
	}
}     */

//-------------------------------------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

 public static void main(String[] args) {
	
//6. Ler um número e se for maior que 20, mostrar a metade desse número
	 
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Digite um número: ");
	 double numero = entrada.nextDouble();
	 
	 if (numero > 20) {
		System.out.println(numero / 2);
	}
	 
	 
	 
	 
	  }
}  */