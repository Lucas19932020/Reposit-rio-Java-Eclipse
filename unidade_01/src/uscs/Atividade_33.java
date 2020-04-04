package uscs;

public class Atividade_33 {

	public static void main(String[] args) {
		int y = 0;
		int[] x = new int [10];
		for(int i = 0; i < x.length; i ++) {
			x[i] = i;
			y = y + i;
		}
		System.out.println(y);
	}
}
// A saída é: 45