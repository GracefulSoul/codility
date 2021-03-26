package lesson09;


public class MaxDoubleSliceSum {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,2,6,-1,4,5,-1,2}));
	}
	
	// https://app.codility.com/demo/results/trainingZ9SZBR-5H4/
	private static int solution(int[] A) {
		int result = 0;
		// Init subsum arrays.
		int[] firstSubSum = new int[A.length];
		for (int idx = 1; idx < A.length - 1; idx++) {
			firstSubSum[idx] = Math.max(0, firstSubSum[idx - 1] + A[idx]);
		}
		int[] secondSubSum = new int[A.length];
		for (int idx = A.length - 2; idx >= 1; idx--) {
			secondSubSum[idx] = Math.max(0, secondSubSum[idx + 1] + A[idx]);
		}
		// Calculate max(result) value.
		for (int idx = 1; idx < A.length - 1; idx++) {
			int temp = firstSubSum[idx - 1] + secondSubSum[idx + 1];
			if (temp > result) {
				result = temp;
			}
		}
		return result;
	}

}
