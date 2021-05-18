package atividade;
import java.util.Scanner;
class ExercicioJoaoPescador {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite o peso dos peixes: ");
	double PesoPeixe = entrada.nextDouble();
	
    double excesso = PesoPeixe > 50 ? (PesoPeixe - 50) : 0;
     
    double multa = (excesso * 4);
     
  System.out.println("Quantidade excedida: " + excesso + "Kg");
  System.out.println("Quantidade excedida: R$ " + multa);
    
    
    
    
    
    
 }
  }