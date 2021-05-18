package atividade;
import java.util.Scanner;

public class ListaDeExercicios08092020 {

	public static void main(String[] args) {

//1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) 
	
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

//2. Fazer um programa que imprima a média aritmética de 4 notas solicitadas. 
				
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
	
	System.out.println("A média das notas é:  " + mediaAritmetica);*/
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
    
    System.out.println("O seu saldo reajustado é: ");
    System.out.println(reajuste + saldo);/*
 
//--------------------------------------------------------------------------------------------------------------------------------------------------------
/* 4. Escrever um algoritmo que lê: 
- a porcentagem do IPI a ser acrescido no valor das peças 
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)

package atividade;
import java.util.Scanner;

public class ListaDeExercicios08092020 {

	public static void main(String[] args) {
    

 Scanner entrada = new Scanner (System.in);
 
 System.out.println("Digite o valor do IPI: ");
 Float IPI = entrada.nextFloat();
 
 System.out.println("Digite o código da peça 1: "); System.out.println("Digite o valor unitário da peça 1: ");System.out.println("Digite a quantidade de peças 1: ");
 Float codigo1 = entrada.nextFloat();Float valorUnitario1 = entrada.nextFloat();Float quantPecas1 =  entrada.nextFloat();
 
 System.out.println("Digite o código da peça 2: "); System.out.println("Digite o valor unitário da peça 2: ");System.out.println("Digite a quantidade de peças 2: ");
 Float codigo2 = entrada.nextFloat();Float valorUnitario2 = entrada.nextFloat();Float quantPecas2 =  entrada.nextFloat();
				
 Float valorTotal =	(valorUnitario1*quantPecas1 + valorUnitario2*quantPecas2)*(IPI/100 + 1);
				
 System.out.println("O valor total é: " + valorTotal);	*/
 

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (1SM=R$1045,00) 				
  			
/*package atividade;
import java.util.Scanner;

public class ListaDeExercicios08092020 {

	public static void main(String[] args) {
		
	 Scanner entrada = new Scanner (System.in);
	 
	 System.out.println("Digite o seu salário: ");
	 String Salario = entrada.nextLine();
	 
	 Integer SalarioA = Integer.parseInt(Salario);
	 Integer SalarioB = (SalarioA * 1) / 1045;
	 System.out.println("Você recebe " + SalarioB + " salário(s) mínimo(s)");*/
//---------------------------------------------------------------------------------------------
	/* 6. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
	
	 package atividade;
	 import java.util.Scanner;

	 public class ListaDeExercicios08092020 {

	 	public static void main(String[] args) {			
		
	 Scanner entrada = new Scanner(System.in);
	 
	 System.out.println("Digite um número: ");
	 Integer Numero = entrada.nextInt();
	 
	 Integer Calculo1 = (Numero + 1);
	 Integer Calculo2 = (Numero - 1);
	 
	 System.out.println("Próximo Número: " + Calculo1 + " Número anterior: " + Calculo2);*/
				
			}
}