package lesson11;

import java.util.Arrays;

public class CountNonDivisible {

	public static void main(String[] args) {
		print(solution(new int[] {3,1,2,3,6}));
	}
	
	// https://app.codility.com/demo/results/trainingVZ25BY-FPX/
	private static int[] solution(int[] A) {
		int[] result = new int[A.length];
		// Initializing array, element's range is [1, 2 * N]
		int[] divisors = new int[(A.length * 2) + 1];
		for (int idx = 0; idx < A.length; idx++) {
			divisors[A[idx]]++;
		}
		for (int idx1 = 0; idx1 < A.length; idx1++) {
			int count = 0;
			for (int idx2 = 1; idx2 * idx2 <= A[idx1]; idx2++) {
				// Common factor
				if (A[idx1] % idx2 == 0) {
					count += divisors[idx2];
					// Not Square root
					if (A[idx1] / idx2 != idx2) {
						count += divisors[A[idx1] / idx2];
					}
				}
			}
			result[idx1] = A.length - count;
		}
		return result;
	}

	private static void print(int[] array) {
		Arrays.stream(array).forEach(System.out::println);
	}

}
