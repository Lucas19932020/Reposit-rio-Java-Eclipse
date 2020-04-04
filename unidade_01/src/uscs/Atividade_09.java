package uscs;

public class Atividade_09 {

	public static void main(String[] args) {
		String S1 = args[0];
		String S2 = null;
		S2 = args[1]+ args[0];
		String S3 = new String(S2.toUpperCase());
		System.out.println(S1+S2+S3);
	}

}
/*A saída é:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
 * at uscs.Atividade_09.main(Atividade_09.java:6)
 */
