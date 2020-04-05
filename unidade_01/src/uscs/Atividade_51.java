package uscs;

public class Atividade_51 {

	public static void main(String[] args) {
		int S = 0;
		int[] tab = new int [4];
		for(int i = 0; i < tab.length; i ++) {
			tab[i] = i;
			S = S + tab[i];
		}
		System.out.println(fatorial(S));
	}
	public static int fatorial(int n) {
		if(n==0)
			return 1;
		else
			return(n*fatorial(n-1));
	}
	
}
//A saída é: 720
