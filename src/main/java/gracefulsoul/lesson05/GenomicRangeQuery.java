package gracefulsoul.lesson05;

import java.util.Arrays;

public class GenomicRangeQuery {

	public static void main(String[] args) {
		print(solution("CAGCCTA", new int[] {2, 5, 0}, new int[] {4, 5, 6}));
	}
	
	// https://app.codility.com/demo/results/trainingQSWXB3-AAH/
	public static int[] solution(String S, int[] P, int[] Q) {
		int[] result = new int[P.length];
		// All array is start 0. (Check for changing character is exists.)
		int[] A = new int[S.length() + 1];
		int[] C = new int[S.length() + 1];
		int[] G = new int[S.length() + 1];
		// Initializing each array.
		for (int idx = 0; idx < S.length(); idx++) {
			A[idx + 1] = A[idx];
			C[idx + 1] = C[idx];
			G[idx + 1] = G[idx];
			switch(S.charAt(idx)) {
				case 'A': A[idx + 1]++; break;
				case 'C': C[idx + 1]++; break;
				case 'G': G[idx + 1]++; break;
				default: break;
			}
		}
		// Check for contains word in P and Q.
		for (int idx = 0; idx < P.length; idx++) {
			if (A[P[idx]] != A[Q[idx] + 1]) {
				result[idx] = 1;
			} else if (C[P[idx]] != C[Q[idx] + 1]) {
				result[idx] = 2;
			} else if (G[P[idx]] != G[Q[idx] + 1]) {
				result[idx] = 3;
			} else {
				result[idx] = 4;
			}
		}
		return result;
	}
	
	private static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}

}
