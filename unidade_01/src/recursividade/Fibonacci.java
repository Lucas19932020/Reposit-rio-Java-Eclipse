package recursividade;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.print("0 ");
		for(int a = 1; a <= 10; a++)
		System.out.print(Fibonacci(a) + " "); 
	}
	
	public static int Fibonacci(int a) {
		if(a<=1)
			return a;
		else
			return (Fibonacci(a-1) + Fibonacci(a-2));
	}

}
