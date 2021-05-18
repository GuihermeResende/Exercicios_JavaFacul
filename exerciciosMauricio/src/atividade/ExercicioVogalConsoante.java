package atividade;
import java.util.Scanner; 
public class ExercicioVogalConsoante {
public static void main(String[] args) {
	
 Scanner entrada = new Scanner(System.in);
 
 System.out.println("Digite uma letra");
 String Letra = entrada.nextLine();
 
 if  (Letra.equalsIgnoreCase("A"))   {
	 System.out.println("Vogal");
 }    

 else
    if (Letra.equalsIgnoreCase("E")) {
     System.out.println("Vogal");
 }
 else
    if (Letra.equalsIgnoreCase("I")) {
	 System.out.println("Vogal");
 }
 else
    if (Letra.equalsIgnoreCase("O")) {
	 System.out.println("Vogal");
 }
 else 
   if (Letra.equalsIgnoreCase("U"))  {
	 System.out.println("Vogal");
}
 else {
	System.out.println("Consoante");

}








 }
}