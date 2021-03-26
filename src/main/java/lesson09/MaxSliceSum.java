package lesson09;

public class MaxSliceSum {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,2,-6,4,0}));
	}
	
	// https://app.codility.com/demo/results/trainingNXT2S3-3U7/
	private static int solution(int[] A) {
		int max = A[0];
		int sum = A[0];
		for (int idx = 1; idx < A.length; idx++) {
			sum = Math.max(A[idx], sum + A[idx]);
			if (max < sum) {
				max = sum;
			}
		}
		return max;
	}

}
