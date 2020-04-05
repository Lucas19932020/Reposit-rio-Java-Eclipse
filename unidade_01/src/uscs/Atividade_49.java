package uscs;

import java.util.Arrays;

public class Atividade_49 {

	public static void main(String[] args) {
		int NMAX = 3;
		int [][] mt = new int[NMAX] [];
		
		for(int n = 0; n < NMAX; n++)
			mt[n] = new int[n+1];
		for (int n=0; n < mt.length; n++) {
			for(int k = 0; k < mt[n].length; k++)
				mt[n][k] = n + k;
		}
		System.out.println(Arrays.deepToString(mt));
	}
}
//A saída é: [[0], [1, 2], [2, 3, 4]]