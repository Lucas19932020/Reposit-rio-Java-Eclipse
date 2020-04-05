package uscs;

public class Atividade_45 {

	public static void main(String[] args) {
		printPrimes(20);
	}
	
	public static void printPrimes(int n) {
		boolean [] prime = new boolean[n + 1];
		for(int i = 2; i <= n; i++) {
			prime[i] = true;
		}
		for (int divisor = 2; divisor*divisor <= n; divisor++) {
			if(prime[divisor]) {
				for(int i=2*divisor; i<=n; i+=divisor) {
					prime[i]=false;
				}		
			}
		}

		for(int i=0; i<n; i++)
			if (prime[i]) {
				System.out.print(" " + i);}
	}
}
//A saída é: 2 3 5 7 11 13 17 19
