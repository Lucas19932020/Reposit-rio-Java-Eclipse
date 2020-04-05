package uscs;

import java.util.Arrays;

public class Atividade_41 {

	public static void main(String[] args) {
		int[] x = new int[] {3, 1, 6, 2, 9, 5, 0};
		Arrays.parallelSort(x);
		for(int elem : x)
			System.out.print(elem + " ");
	}
}
//A saída é: 0 1 2 3 5 6 9 