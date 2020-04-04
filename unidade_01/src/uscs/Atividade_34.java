package uscs;

public class Atividade_34 {

	public static void main(String[] args) {
		int [] x = new int [5];
		int [] y = x;
		for(int i = 0; i < x.length; i++) {
			x[i] = i+5;
			y[i] = x[i]-5;
		}
		for (int elem:y)
			System.out.print(elem + " ");
	}
}
//A saída é: 0 1 2 3 4 