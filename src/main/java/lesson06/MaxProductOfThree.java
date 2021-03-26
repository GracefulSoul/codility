package lesson06;

import java.util.Arrays;

public class MaxProductOfThree {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {-3,1,2,-2,5,6}));
	}
	
	// https://app.codility.com/demo/results/training6ZYATQ-GE7/
	private static int solution(int[] A) {
		Arrays.sort(A);
		// The initial value is set to a value greater than 3.
		int result = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
		// Check if the two smallest values are negative and the largest value is positive.
		if (A[0] < 0 && A[1] < 0 && A[A.length - 1] > 0) {
			int temp = A[0] * A[1] * A[A.length - 1];
			if (result < temp) {
				result = temp;
			}
		}
		return result;
	}

}
