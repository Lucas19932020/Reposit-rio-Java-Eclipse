package uscs;

public class Atividade_11 {

	public static void main(String[] args) {
		String S1 = args[0];
		String S2 = null;
		S2 = args[0]+args[1];
		int x = Integer.parseInt(S1);
		int y = Integer.parseInt(S1+S2);
		System.out.println(x+y);
	}
}
/*A saída é:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
 *	at uscs.Atividade_11.main(Atividade_11.java:6)
 */
