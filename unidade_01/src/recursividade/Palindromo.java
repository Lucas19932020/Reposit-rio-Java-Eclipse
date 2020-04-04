package recursividade;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		/* Maior palíndromo do mundo: SAIPPUAKIVIKAUPPIAS,
		 *  que vem do finalandês e significa "vendedor de soda cáustica"
		 */
		
		// O maior palíndromo da língua portuguesa é Omissíssimo (usar: OMISSISSIMO).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um String: ");
		String x = sc.nextLine();
		
		if ( isPalindrome(x) )
			System.out.println("O string " + x + " é um PALÍNDROMO...");
		else
			System.out.println("O string " + x + " não é um PALÍNDROMO...");
	}
	
	public static boolean isPalindrome(String s) {
		if (s.length() <= 1) {
			System.out.println(s);
			return true;
		}
		else {
			if (s.charAt(0) != s.charAt((s.length() - 1)) ) {
				return false;
			}
			else {
				System.out.println(s);	
				return isPalindrome( s.substring(1,s.length()-1) );
				 }
			 }
	}	
}
