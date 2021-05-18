package atividade;
import java.util.Scanner;
public class LojaDeTintas {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o tamanho de metros a ser pintado:  ");
	double TamanhoParede = entrada.nextDouble();

    double QuantidadeLitros = TamanhoParede / 3;
    
    double QuantidadeLatas = Math.ceil(QuantidadeLitros / 18);
    
    double valor = QuantidadeLatas * 80;
    
    System.out.println("Quantidade de latas: " + QuantidadeLatas);
	System.out.println("Valor: " + valor);
	
		
		
		
	}

}
