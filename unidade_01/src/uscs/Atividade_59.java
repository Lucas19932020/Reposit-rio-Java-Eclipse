package uscs;

public class Atividade_59 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("\n" + Func(n));
	}
	public static int Func (int a) {
		if (a < 2)
			return 1;
		else
			return (a-1) * Func(a-1);
	}
}
/*A saída é:
 * 
 * 24
 */