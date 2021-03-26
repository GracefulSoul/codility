package lesson04;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,6,4,1,2}));
		System.out.println(solution(new int[] {1,2,3}));
		System.out.println(solution(new int[] {-1,-3}));
	}

	// https://app.codility.com/demo/results/trainingUU6XSV-FG4/
	public static int solution(int[] A) {
		Set<Integer> numSet = new HashSet<>();
		for (int num : A) {
			if (num > 0) {
				numSet.add(num);
			}
		}
		for (int idx = 1; idx <= Integer.MAX_VALUE; idx++) {
			if (!numSet.contains(idx)) {
				return idx;
			}
		}
		return 1;
	}

}
