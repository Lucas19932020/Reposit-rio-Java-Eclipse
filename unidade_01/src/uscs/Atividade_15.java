package uscs;

public class Atividade_15 {

	public static void main(String[] args) {
		int i = 0x00FF;
		int j = 0x0FF0;
		System.out.println(i & j);
	}
}
//A sa�da �: 240
/* Motivo: Os car�cter "&" compara os dois valores bit a bit
 * 0x00FF em bin�rio: 0000 0000 1111 11111
 * 0x0FF0 em bin�rio: 0000 1111 1111 00000
 * Se repetem em:	  0000 0000 1111 00000
 * Em decimal:		  0000 0000 1111 00000 = 240
 */