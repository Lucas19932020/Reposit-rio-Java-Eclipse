package uscs;

public class Atividade_25 {

	public static void main(String[] args) {
		int i = 8, x = 0, y = 0;
		while (i >= 0) {
			if((i % 2) == 0)
				x = x + i;
			else 
				y = y + i;
			i = i - 1;
		}
		System.out.print(x + " " + y);
	}
}
