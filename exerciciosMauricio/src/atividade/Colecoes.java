package atividade;
import java.util.HashSet;
public class Colecoes {

	public static void main(String[] args) {
	
		HashSet conjunto = new HashSet();
            conjunto.add("Olá meu querido");
            conjunto.add(true);
            conjunto.add(1);
	
	System.out.println("Tamanho é:" + conjunto.size());
	 
	System.out.println(conjunto.remove(1));  //se o elemento tem ele printa (true) caso não (false)....
	
	
	}

}
