package recursividade;

public class Max_Recursivo {

	public static void main(String[] args) {
		int [] tab = {4,6,8,1,4,9,10,4};
		
		int n = tab.length;
		
		Imprime(tab);
		
		System.out.println("Máximo: " + max_Recursivo(tab, n));
	}
	
	public static void Imprime(int [] tab) {
		System.out.print("Array: [ ");
		for(int i=0; i< tab.length; i++) {
			System.out.print(tab[i] + " "); 
		}
		System.out.println("]");
		
	}
	
	public static int max_Recursivo(int [] tab, int n) {
		if (n == 1)
			return tab[0];
		else {
			int maximo = max_Recursivo(tab, n-1);
			System.out.println(maximo);
			if(maximo < tab[n-1])
				return tab[n-1];
			else
				return maximo;
		}
	}
}
