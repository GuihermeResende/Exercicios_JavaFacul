package atividade;
import java.util.Scanner;

public class ListaDeExercicios08092020 {

	public static void main(String[] args) {

//1. Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em considera��o o ano com 365 dias e o m�s com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("Digite a sua idade : ");
	Integer anos = entrada.nextInt();
	
	System.out.println("Digite quantos meses : ");
	Integer meses = entrada.nextInt();
	
	System.out.println("Digite quantos dias : ");
	Integer dias = entrada.nextInt();
	
	int a = anos * 365;
	int b = meses * 30;
	int c = dias * 1;
	
	System.out.printf("%d , %d e %d = " , anos, meses, dias);
	System.out.println(a + b + c); 
		

/*package atividade;
	
import java.util.Scanner;
public class ListaDeExercicios08092020 {

			public static void main(String[] args) {
//------------------------------------------------------------------------------------------------------------------------------------------		

//2. Fazer um programa que imprima a m�dia aritm�tica de 4 notas solicitadas. 
				
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite a primeira nota: ");
	Float nota1 = entrada.nextFloat();
			
	System.out.println("Digite a segunda nota: ");
	Float nota2 = entrada.nextFloat();
	
	System.out.println("Digite a terceira nota: ");
	Float nota3 = entrada.nextFloat();
	
	System.out.println("Digite a quarta nota: ");
	Float nota4 = entrada.nextFloat();
	
	Float mediaAritmetica = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.println("A m�dia das notas �:  " + mediaAritmetica);*/
//-----------------------------------------------------------------------------------------------------------------------------------------------------
/*package atividade;
import java.util.Scanner;

public class ListaDeExercicios08092020 {

	public static void main(String[] args) {
	
//3. Informar um saldo e imprimir o saldo com reajuste de 1%.	
    
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("informe o valor do seu saldo: ");
    Double saldo =  entrada.nextDouble();
    
    Double reajuste = (1 * saldo) /100;
    
    System.out.println("O seu saldo reajustado �: ");
    System.out.println(reajuste + saldo);/*
 
//--------------------------------------------------------------------------------------------------------------------------------------------------------
/* 4. Escrever um algoritmo que l�: 
- a porcentagem do IPI a ser acrescido no valor das pe�as 
- o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as 1 
- o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2 
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

package atividade;
import java.util.Scanner;

public class ListaDeExercicios08092020 {

	public static void main(String[] args) {
    

 Scanner entrada = new Scanner (System.in);
 
 System.out.println("Digite o valor do IPI: ");
 Float IPI = entrada.nextFloat();
 
 System.out.println("Digite o c�digo da pe�a 1: "); System.out.println("Digite o valor unit�rio da pe�a 1: ");System.out.println("Digite a quantidade de pe�as 1: ");
 Float codigo1 = entrada.nextFloat();Float valorUnitario1 = entrada.nextFloat();Float quantPecas1 =  entrada.nextFloat();
 
 System.out.println("Digite o c�digo da pe�a 2: "); System.out.println("Digite o valor unit�rio da pe�a 2: ");System.out.println("Digite a quantidade de pe�as 2: ");
 Float codigo2 = entrada.nextFloat();Float valorUnitario2 = entrada.nextFloat();Float quantPecas2 =  entrada.nextFloat();
				
 Float valorTotal =	(valorUnitario1*quantPecas1 + valorUnitario2*quantPecas2)*(IPI/100 + 1);
				
 System.out.println("O valor total �: " + valorTotal);	*/
 

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//5. Crie um algoritmo que leia o valor do sal�rio m�nimo e o valor do sal�rio de um usu�rio, calcule a quantidade de sal�rios m�nimos esse usu�rio ganha e imprima o resultado. (1SM=R$1045,00) 				
  			
/*package atividade;
import java.util.Scanner;

public class ListaDeExercicios08092020 {

	public static void main(String[] args) {
		
	 Scanner entrada = new Scanner (System.in);
	 
	 System.out.println("Digite o seu sal�rio: ");
	 String Salario = entrada.nextLine();
	 
	 Integer SalarioA = Integer.parseInt(Salario);
	 Integer SalarioB = (SalarioA * 1) / 1045;
	 System.out.println("Voc� recebe " + SalarioB + " sal�rio(s) m�nimo(s)");*/
//---------------------------------------------------------------------------------------------
	/* 6. Desenvolva um algoritmo em Java que leia um n�mero inteiro e imprima o seu antecessor e seu sucessor.
	
	 package atividade;
	 import java.util.Scanner;

	 public class ListaDeExercicios08092020 {

	 	public static void main(String[] args) {			
		
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Digite um n�mero: ");
	 Integer Numero = entrada.nextInt();
	 
	 Integer Calculo1 = (Numero + 1);
	 Integer Calculo2 = (Numero - 1);
	 
	 System.out.println("Pr�ximo N�mero: " + Calculo1 + " N�mero anterior: " + Calculo2);*/
				
			}
}