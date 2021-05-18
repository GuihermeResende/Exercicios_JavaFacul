package atividade;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		//Double potencia = Math.pow(2, 3); 2 elevado a 3
	    // int potencia = (int) Math.pow(2, 3);

	   //[6 * (3 + 2)] ** 2 / 3 * 2; 
	   double a = 6 * (3+2);
	   double NumeroA = Math.pow(a, 2);
	   double DenA = 3 * 2;
	   
	   //(1 - 5) * (2 - 7) **2 / 2;
	    double b = (1 - 5) * (2 - 7);
	    double denB = 2;
	   
	    
	    double SuperiorA = NumeroA / DenA;
	    double SuperiorB = Math.pow(b / denB, 2);
	
	    double Superior = Math.pow(SuperiorA - SuperiorB, 3);
	    double inferior = Math.pow(10, 3);
	
	    System.out.println(Superior/ inferior);
	}

}
