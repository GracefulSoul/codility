package lesson06;

import java.util.Arrays;

public class Triangle {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {10, 2, 5, 1, 8, 20}));
		System.out.println(solution(new int[] {10, 50, 5, 1}));
	}
	
	// https://app.codility.com/demo/results/trainingS8CWFP-THS/
	private static int solution(int[] A) {
		if (A.length < 3) {
			return 0;
		}
		Arrays.sort(A);
		for (int idx = 0; idx < A.length - 2; idx++) {
			if ((long)A[idx] + (long)A[idx + 1] > A[idx + 2]) {
				return 1;
			}
		}
		return 0;
	}

}
