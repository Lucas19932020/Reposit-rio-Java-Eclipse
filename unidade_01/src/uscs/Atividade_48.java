package uscs;

import java.util.Arrays;

public class Atividade_48 {

	public static void main(String[] args) {
		int [] [] nums = new int [4][2];
		for (int r = 0; r < nums.length; r++) {
			for(int c = 0; c < nums[r].length; c++)
				nums [r][c] = c + r;
		}
		System.out.println(Arrays.deepToString(nums));
	}
}
//A saída é: [[0, 1], [1, 2], [2, 3], [3, 4]]