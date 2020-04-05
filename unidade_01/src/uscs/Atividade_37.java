package uscs;

import java.util.Arrays;

public class Atividade_37 {

	public static void main(String[] args) {
		int[] x = new int[3];
		int[] y = new int[5];
		
		for (int i = 1; i < x.length; i++) {
			x[i] = x[i-1] +2;
			y[i] = x[i];
		}
		System.out.println(Arrays.toString(y));
	}
}
//A saída é: [0, 2, 4, 0, 0]