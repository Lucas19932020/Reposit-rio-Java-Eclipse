package uscs;

public class Atividade_12 {

	public static void main(String[] args) {
			String S1 = args[0];
			String S2 = null;
			S2 = args[0]+args[1];
			String S3 = null;
			S3 = (args[1]+args[2]).concat(S1);
			int x = Integer.parseInt(S1);
			int y = Integer.parseInt(S1+S2);
			int z = Integer.parseInt(S3);
			System.out.println(x+y+z);
	}
}
/*A saída é:
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
 * at uscs.Atividade_12.main(Atividade_12.java:6)
 */
