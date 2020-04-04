package uscs;

public class Atividade_16 {

	public static void main(String[] args) {
		int i = 0xFF;
		int j = 0x0F;
		int k = 0x00;
		System.out.println((i & j) | k);
	}
}
//A saída é: 15
/* Motivo: Os carácteres "&" e "|" comparam os valores bit a bit
 * 0xFF em binário: 1111 1111
 * 0x0F em binário: 0000 1111
 * 0x00 em binário: 0000 0000
 * Se repetem em:   0000 1111
 * Em decimal:      0000 1111 = 15
 */