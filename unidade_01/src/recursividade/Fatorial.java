package recursividade;

public class Fatorial {

	public static void main(String[] args) {
		int  n=10;
		System.out.println("Fatorial(" + n + ") = " + fatorial(n));
		}

	public static int fatorial(int a) {
		if(a == 0)
		return 1;
		else
			return(a*fatorial(a-1));
		
	}
		
}