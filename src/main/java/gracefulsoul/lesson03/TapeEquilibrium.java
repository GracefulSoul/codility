package gracefulsoul.lesson03;

public class TapeEquilibrium {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,1,2,4,3}));
		System.out.println(solution(new int[] {1000, -1000}));
	}
	
	// https://app.codility.com/demo/results/training2C4RED-4GW/
	public static int solution(int[] A) {
		int min = Integer.MAX_VALUE;
		int sum = sumArray(A);
		int subSum = 0;
		for (int idx = 0; idx < A.length - 1; idx++) {
			subSum += A[idx];
			sum -= A[idx];
			int difference = Math.abs(subSum - sum);
			if (difference < min) {
				min = difference;
			}
		}
		return min;
	}
	
	private static int sumArray(int[] A) {
		int sum = 0;
		for (int num : A) {
			sum += num;
		}
		return sum;
	}

}
