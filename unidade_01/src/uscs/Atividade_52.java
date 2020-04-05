package uscs;

public class Atividade_52 {

	public static void main(String[] args) {
		int[] tab = new int[6];
		for(int i=0; i<tab.length;i++)
			tab[i] = i;
		System.out.println(soma_Rec(tab,tab.length));
	}
	public static int soma_Rec(int[] A, int n) {
		if(n == 1)
			return
				A[0];
		else
			return
				soma_Rec(A,n-1) + A[n-1];
	}
}
//A saída é: 15

