package uscs;

import java.util.Arrays;

public class Atividade_44 {

	public static void main(String[] args) {
		int[] x = new int [4];
		for(int i = 1; i<x.length; i++) {
			x[i] = x[i-1] + 10;			
		}
		int[] y = Arrays.copyOf(x, 5);
		Arrays.fill(y, 8);
		for(int elem : y)
			System.out.print(elem + " ");
	}
}
//A sa�da �: 8 8 8 8 8