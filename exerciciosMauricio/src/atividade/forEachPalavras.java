package atividade;
import java.util.Arrays;
public class forEachPalavras {
		

			public static void main(String[] args) {
				String [] vetorA = {"C ", "JAVA ", "C# "};
				String [] vetorB = {"PHP", "Python", "C++ "};
				
				String [] vetorC = new String[6];
				
				
				for (int i = 0; i < vetorA.length; i++) {
					vetorC[i] = vetorA[i];
				}
				
				int x = 0;
				for (int i = 3; i < vetorC.length; i++) {
					vetorC[i] = vetorB[x];
					x++;
				}
				
				for (String j : vetorC) {
					System.out.println(j);
				}
			}

    
	

}
