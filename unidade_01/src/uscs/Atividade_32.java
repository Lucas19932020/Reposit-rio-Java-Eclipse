package uscs;

public class Atividade_32 {

	public static void main(String[] args) {
		int i, j;
		for (i = 0, j = 10; i < 4; i++, j++ )
			System.out.print(i + " ");
		do {
			System.out.print(j + " ");
			i = i + 5;
		}while (i < 10);
	}
}
//A saída é: 0 1 2 3 14 14 