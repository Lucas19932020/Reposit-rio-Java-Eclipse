package recursividade;

public class Exercicio_Recursivo_02 {

	public static void main(String[] args) {
		int[] tab = new int[6];
		for (int i=0; i<tab.length; i++) {
		tab[i] = i;
		}

		imprime(tab);
		reverte_array(tab,0,tab.length-1);
	}

	public static void reverte_array(int[] v, int i, int j) {
		if (i<j) {
		swap(v,i,j);
		imprime(v);
		reverte_array(v, i+1, j-1);
		}
	}
		
	public static void swap(int[] v, int i, int j) {
		int trab = v[i];
		v[i] = v[j];
		v[j] = trab;
	}
	
	public static void imprime(int[] v) { 
		System.out.print("Array: ");
		for (int i=0; i<v.length; i++) {
			 System.out.print ( v[i] + " ");
		 }
		 System.out.println("");
	} 
	
}
