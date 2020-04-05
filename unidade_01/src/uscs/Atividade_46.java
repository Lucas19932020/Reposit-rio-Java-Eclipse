package uscs;

import java.util.Arrays;

public class Atividade_46 {

	public static void main(String[] args) {
		int[] x = new int[10];
		int[] y = new int[10];
		Arrays.fill(x, 5);
		Arrays.fill(y, 5);
		if(Arrays.equals(x, y))
			System.out.println("os arrays " + "são iguais");
		else
			System.out.println("os arrays " + "são diferentes");
	}
}
//A saída é: os arrays são iguais
