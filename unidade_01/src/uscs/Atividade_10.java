package uscs;

public class Atividade_10 {

	public static void main(String[] args) {
		String S1 = args[0];
		String S2 = null;
		S2 = args[1]+args[0];
		int x = Integer.parseInt(S2);
		int y = Integer.parseInt(S1);
		System.out.println(x+y);
	}
}
/*A saída é:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
 *	at uscs.Atividade_10.main(Atividade_10.java:6)
 */
