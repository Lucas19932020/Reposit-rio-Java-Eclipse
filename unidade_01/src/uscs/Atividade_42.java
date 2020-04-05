package uscs;

import java.util.Arrays;

public class Atividade_42 {

	public static void main(String[] args) {
		int x [] = new int [] {3, 1, 6, 2, 9 ,5, 0}; 
		int [] y = new int [7];
		Arrays.sort(x);
		for(int i = x.length-1, j = 0; i>=0; i--, j++) {
			y[i] = x[j];
		}
		for(int elem : y)
			System.out.print(elem + " ");
	}
}
//A saída é: 9 6 5 3 2 1 0 