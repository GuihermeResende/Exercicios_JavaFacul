package atividade;
import java.util.Arrays;
public class MatrizEx3 {

	public static void main(String[] args) {
	

				int[][] mat = new int[3][10];

				for (int i = 0; i < mat.length; i++) {
					for (int j = 0; j < mat[i].length; j++) {
						mat[i][j] = j;
					}
				}

				for (int[] is : mat) {
					System.out.println(Arrays.toString(is));
				}
	}

}
