package atividade;
import java.util.Scanner;
public class ExercOperadorTernario {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite um dia do mês");	
    Integer NumeroDias = entrada.nextInt();
	
	System.out.println((NumeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena");
	

	}

}
