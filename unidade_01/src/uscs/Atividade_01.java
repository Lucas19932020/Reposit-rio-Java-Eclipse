package uscs;

public class Atividade_01 {

	public static void main(String[] args) {
		String a = new String ("USCS");
		String b = new String ("Computa��o");
		a = b;
		b = a;
		System.out.println(a);
		System.out.println(b);
	}
}
/*A sa�da �:
*	Computa��o
*	Computa��o
*/