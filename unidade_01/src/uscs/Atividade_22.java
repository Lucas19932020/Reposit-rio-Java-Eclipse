package uscs;

public class Atividade_22 {

	public static void main(String[] args) {
		int i = 8, x = 0;
		while(i >= 0) {
			if((i % 2) == 0) {
				x++;
			}
			i = i - 1;
		}
		System.out.println(x);
	}
}
//A sa�da �: 5