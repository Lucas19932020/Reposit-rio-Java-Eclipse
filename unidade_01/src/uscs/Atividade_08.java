package uscs;

public class Atividade_08 {

	public static void main(String[] args) {
		String S1 = args[0];
		String S2 = null;
		S2 = args[1];
		String S3 = new String("***".concat(S2.concat("***")));
		System.out.println(S1+S2+S3);
	}
}
/*
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
 * at uscs.Atividade_08.main(Atividade_08.java:6) 
 */