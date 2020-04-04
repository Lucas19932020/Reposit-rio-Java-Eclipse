package uscs;

public class Atividade_17 {
	enum TAMANHO{
					pequeno,
					medio,
					grande,
					extra_grande
	}
	
	public static void main(String[] args) {
		TAMANHO a = TAMANHO.pequeno;
		TAMANHO b = TAMANHO.grande;
		boolean x = 5 != 4;
		boolean y = true ==(10 <= 0);
	
		if (x ==y)
			System.out.println(a);
		else {
			if(x != y)
				System.out.println(a);
			else
				System.out.println(b);
		}
	}
//A saída é: pequeno

}
