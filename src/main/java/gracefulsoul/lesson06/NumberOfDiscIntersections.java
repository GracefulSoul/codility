package gracefulsoul.lesson06;

import java.util.Arrays;

public class NumberOfDiscIntersections {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 5, 2, 1, 4, 0 }));
	}
	
	// https://app.codility.com/demo/results/trainingY8JCA7-Z55/
	private static int solution(int[] A) {
		int result = 0;
		long[] left = new long[A.length];
		long[] right = new long[A.length];
		// Save left and right point each array.
		for (int idx = 0; idx < A.length; idx++) {
			left[idx] = idx - (long) A[idx];
			right[idx] = idx + (long) A[idx];
		}
		Arrays.sort(left);
		Arrays.sort(right);
		int num = 0;
		// Calculate intersects with left and right point.
		for (int idx = 0; idx < A.length - 1; idx++) {
			while (num < A.length && right[idx] >= left[num]) {
				result += num - idx;
				num++;
			}
		}
		// If the number of intersecting pairs excceds 10,000,000.
		if (result > 10000000) {
			return -1;
		}
		return result;
	}

}
