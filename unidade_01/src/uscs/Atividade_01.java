package uscs;

public class Atividade_01 {

	public static void main(String[] args) {
		String a = new String ("USCS");
		String b = new String ("Computação");
		a = b;
		b = a;
		System.out.println(a);
		System.out.println(b);
	}
}
/*A saída é:
*	Computação
*	Computação
*/