package uscs;

public class Atividade_03 {

	public static void main(String[] args) {
		String S1 = new String();
		String S2 = "Hello";
		String S3 = new String(S1+S2);
		String S4 = S3;
		S1 = null;
		S2 = null;
		System.out.println(S4);
	}
}
//A saída é: Hello