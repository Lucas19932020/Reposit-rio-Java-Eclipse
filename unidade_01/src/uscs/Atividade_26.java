package uscs;

public class Atividade_26 {

	public static void main(String[] args) {
		int i = 1, f = 1;
		while (i<=3) {
			for (int j = 1; j <= i; j++)
				f = f * j;
			System.out.print(f + " ");
				i = i + 1;
		}
	}
}
//A sa�da �: 1 2 12