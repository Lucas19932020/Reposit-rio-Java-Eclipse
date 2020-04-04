package recursividade;

public class Exercicio_Recursivo_01 {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("\n" + Func(n)) ;
	}
	
	public static int Func (int a) {
		if (a < 2 ) 
			return 1;
		else
			System.out.println(a-1);
			return (a-1) * Func(a-1);
	}

}
