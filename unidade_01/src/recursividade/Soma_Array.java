package recursividade;

public class Soma_Array {

	public static void main(String[] args) {
		int [] tab = new int [100];
		for(int i=0; i<tab.length; i++)
			tab[i] = i;
		
		System.out.println("A soma dos elementos do array é: " + soma_Rec(tab, tab.length));
	}
	
	public static int soma_Rec(int [] a, int n) {
		if(n == 1) 
			return a [0];
		else
			return soma_Rec(a,n-1) + a[n-1];
		
	}

}
