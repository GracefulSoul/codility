package lesson14;

public class MinMaxDivision {

	public static void main(String[] args) {
		System.out.println(solution(3, 5, new int[] {2,1,5,1,2,2,2}));
	}

	// https://app.codility.com/demo/results/trainingTRFHH9-GJE/
	public static int solution(int K, int M, int[] A) {
		int sum = 0;
		int max = 0;
		for (int idx = 0; idx < A.length; idx++) {
			sum += A[idx];
			if (A[idx] > max) {
				max = A[idx];
			}
		}
		int result = sum;
		while (max <= sum) {
			int mid = (max + sum) / 2;
			if (isDivisable(mid, K, A)) {
				result = mid;
				sum = mid - 1;
			} else {
				max = mid + 1;
			}
		}
		return result;
	}

	private static boolean isDivisable(int mid, int K, int[] A) {
		int size = K;
		int sum = 0;
		for (int idx = 0; idx < A.length; idx++) {
			sum = sum + A[idx];
			if (sum > mid) {
				size--;
				sum = A[idx];
			}
			if (size == 0) {
				return false;
			}
		}
		return true;
	}

}
