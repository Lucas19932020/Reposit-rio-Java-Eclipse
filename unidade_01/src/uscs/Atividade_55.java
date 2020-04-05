package uscs;

public class Atividade_55 {

	public static void main(String[] args) {
		int W = 22;
		int[] x = new int [4];
		for(int i = 1; i < x.length; i++) {
			x[i] = x[i-1] +2;
			W = W - x[i]; 
		}
		System.out.println(Fibonacci(W));
	}
	public static int Fibonacci(int n) {
		if (n <= 1)
			return n;
		else
			return (Fibonacci(n-1) + Fibonacci(n-2));
	}
}
//A saída é: 55