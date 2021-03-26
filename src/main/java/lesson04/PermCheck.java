package lesson04;

import java.util.Arrays;

public class PermCheck {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {4,1,3,2}));
	}
	
	// https://app.codility.com/demo/results/trainingJZTBZU-BE7/
	private static int solution(int[] A) {
		Arrays.sort(A);
		for (int idx = 0; idx < A.length; idx++) {
			if (A[idx] != idx + 1) {
				return 0;
			}
		}
        return 1;
	}

}
