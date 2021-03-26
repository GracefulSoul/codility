package lesson04;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

	public static void main(String[] args) {
		System.out.println(solution(5, new int[] {1,3,1,4,2,3,5,4}));
		System.out.println(solution(2, new int[] {2,2,2,2,2}));
	}

	// https://app.codility.com/demo/results/trainingJ8UD3S-3CE/
	private static int solution(int X, int[] A) {
		Set<Integer> leafs = new HashSet<>();
		for (int idx = 0; idx < A.length; idx++) {
			leafs.add(A[idx]);
			// Get to the goal.
			if (X == leafs.size()) {
				return idx;
			}
		}
		return -1;
	}

}
