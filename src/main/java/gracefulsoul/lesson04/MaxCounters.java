package gracefulsoul.lesson04;

import java.util.Arrays;

public class MaxCounters {

	public static void main(String[] args) {
		print(solution(5, new int[] {3,4,4,6,1,4,4}));
	}
	
	// https://app.codility.com/demo/results/trainingQ5G9KP-C39/
	public static int[] solution(int N, int[] A) {
		int[] result = new int[N];
		int max = 0;
		int init = 0;
		for (int num : A) {
			if (num == N + 1) { // Over than array size and maximum number is N + 1.
				// Set init value using max value.
				init = max;
			} else {
				if (init > result[num - 1]) {
					result[num - 1] = init + 1;
				} else {
					result[num - 1]++;
				}
				// Save maximum value.
				if (result[num - 1] > max) {
					max = result[num - 1];
				}
			}
		}
		// If lower than init value, change each values.
		for (int idx = 0; idx < N; idx++) {
			if (result[idx] < init) {
				result[idx] = init;
			}
		}
		return result;
	}
	
	private static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}

}
