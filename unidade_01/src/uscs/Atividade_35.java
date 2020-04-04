package uscs;

import java.util.Arrays;

public class Atividade_35 {

	public static void main(String[] args) {
		int[] x = new int[5];
		int[] y = x;
		
		for(int i = 0; i <x.length; i++) {
			x[i] = i + 2;
			y[i] = x[i];
		}
		System.out.println(Arrays.toString(y));
	}
}
//A saída é: [2, 3, 4, 5, 6]
