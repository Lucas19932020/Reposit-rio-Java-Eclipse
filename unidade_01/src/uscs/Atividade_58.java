package uscs;

public class Atividade_58 {

	public static void main(String[] args) {
		int[] tab = {4, 6, 8, 1, 4, 9, 10, 4};
		int n = tab.length;
		System.out.println(max_Atividade_58_(tab, n));
	}
	public static int max_Atividade_58_(int[] A, int n) {
		if(n == 1)
			return A[0];
		else {
			int x = max_Atividade_58_(A,n-1);
			if(x < A[n-1])
				return A[n-1];
			else
				return x;
		}
	}
}
//A saída é: 10
