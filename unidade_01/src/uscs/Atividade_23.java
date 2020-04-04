package uscs;

public class Atividade_23 {
	public static void main(String[] args) {
		int i = 8, x = 0, y = 0;
		while(i >= 0) {
			if((i % 2) == 0) 
				x++;
			else
				y++;
			i = i - 1;
		}
		System.out.println(x + " " + y);
	}
}
//A saída é: 5 4
