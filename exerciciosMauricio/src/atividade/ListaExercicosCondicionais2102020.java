/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

	public static void main(String[] args) {
		//1.	Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um n�mero: ");
	Double numero1 = entrada.nextDouble();
	
	System.out.println("Digite um segundo n�mero");
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
	
	//2.	Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
	
	System.out.println("Digite um n�mero: ");
	double Numero = entrada.nextDouble();
	
	if (Numero < 0) {
		System.out.println("N�mero negativo..");
	}
	
	else {
		System.out.println("N�mero positivo..");
	} 
	
   }
 }  */

//-------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

	public static void main(String[] args) {
    
		//3.Fa�a um algoritmo que receba um n�mero e mostre uma mensagem caso este n�mero seja maior que 10
		
	Scanner entrada = new Scanner(System.in);
    
	System.out.println("Digite um n�mero: ");
    double Numero = entrada.nextDouble();
    
    if (Numero > 10) {
		System.out.println("N�mero maior que 10");
	}
		
		
}
   }  */

//-------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

	public static void main(String[] args) {
		
		//4.	Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido	
		
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
		System.out.println("Sexo inv�lido");
	}
		
}	
	}  */
//-------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

	public static void main(String[] args) {

     //5. Dada a idade de um nadador, informe, informe a sua categoria: Infantil (at� 10 anos), Juvenil (at� 17 anos) ou S�nior (acima de 17 anos)
	
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
			System.out.println("Categoria: S�nior");
		
	}
}     */

//-------------------------------------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;
public class ListaExercicosCondicionais2102020 {

 public static void main(String[] args) {
	
//6. Ler um n�mero e se for maior que 20, mostrar a metade desse n�mero
	 
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Digite um n�mero: ");
	 double numero = entrada.nextDouble();
	 
	 if (numero > 20) {
		System.out.println(numero / 2);
	}
	 
	 
	 
	 
	  }
}  */