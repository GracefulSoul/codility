package lesson09;

public class MaxProfit {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {23171,21011,21123,21366,21013,21367}));
	}
	
	// https://app.codility.com/demo/results/trainingTQDNU5-K6T/
	private static int solution(int[] A) {
		int result = 0;
		// The function should return 0 if it was impossible to gain any profit.
		if (A.length < 2) {
			return 0;
		}
		int min = A[0];
		for (int idx = 1; idx < A.length; idx++) {
			if (A[idx] < min) {
				min = A[idx];
			} else {
				int temp = A[idx] - min;
				if (result < temp) {
					result = temp;
				}
			}
		}
		return result;
	}

}
