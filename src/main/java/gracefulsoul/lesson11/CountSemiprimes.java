package gracefulsoul.lesson11;

import java.util.Arrays;

public class CountSemiprimes {

	public static void main(String[] args) {
		print(solution(26, new int[] {1,4,16}, new int[] {26,10,20}));
	}
	
	// https://app.codility.com/demo/results/trainingKCBQY4-U9U/
	private static int[] solution(int N, int[] P, int[] Q) {
		int[] result = new int[P.length];
		int[] preSum = getPreSum(N);
		for (int idx = 0; idx < P.length; idx++) {
			result[idx] = preSum[Q[idx]] - preSum[P[idx] - 1];
		}
		return result;
	}
	
	private static int[] getPreSum(int N) {
		int[] preSum = new int[N + 1];
		int[] flags = getCheckNumbers(N);
		int semiPrimeCount = 0;
		for (int idx = 2; idx <= N; idx++) {
			if (flags[idx] == 2) {
				semiPrimeCount++;
			}
			preSum[idx] = semiPrimeCount;
		}
		return preSum;
	}
	
	// 1: No prime, 2: SemiPrime
	private static int[] getCheckNumbers(int N) {
		int[] flags = new int[N + 1];
		flags[0] = 1;
		flags[1] = 1;
		for (int idx = 2; idx * idx <= N; idx++) {
			if (flags[idx] == 1) {
				continue;
			}
			int multiple = idx * idx;
			while (multiple <= N) {
				if (flags[idx] == 0 && flags[multiple / idx] == 0) {
					flags[multiple] = 2;
				} else {
					flags[multiple] = 1;
				}
				multiple = multiple + idx; // Next multiple number.
			}
		}
		return flags;
	}
	
	private static void print(int[] array) {
		Arrays.stream(array).forEach(System.out::println);
	}

}
