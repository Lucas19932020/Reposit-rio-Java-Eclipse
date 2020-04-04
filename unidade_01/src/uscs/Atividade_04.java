package uscs;

public class Atividade_04 {

	public static void main(String[] args) {
		String S1 = new String();
		S1 = "Hello";
		String S2 = new String();
		S2 = S1;
		S2 = new String(S1);
		String S3 = new String(S1+S2);
		System.out.println(S3);
	}
}
//A saída é: HelloHello
