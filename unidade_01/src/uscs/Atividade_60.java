package uscs;

public class Atividade_60 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("\n" + Func(n));
	}
	
	public static int Func (int a) {
		if (a < 3)
			return 2;
		else
			return (a-1) * Func(a-2);
	}
}	
/*A saída é:
 * 
 * 16
 */


