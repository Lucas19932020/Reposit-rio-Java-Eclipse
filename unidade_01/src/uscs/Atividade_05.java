package uscs;

public class Atividade_05 {

	public static void main(String[] args) {
		String S1 = new String("abcd");
		String S2 = null;
		S2 = S1;
		String S3 = new String(S2.toUpperCase());
		System.out.println(S1+S2+S3);
	}
}
//A sa�da �: abcdabcdABCD