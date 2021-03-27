package gracefulsoul.lesson08;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {3,4,3,2,3,-1,3,3}));
	}
	
	private static int solution(int[] A) {
		Map<Integer, Integer> map = new HashMap<>();
		// Calculate how many numbers are in the array(A).
		for (int num : A) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int num = 0;
		int max = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > max) {
				num = entry.getKey();
				max = entry.getValue();
			}
		}
		// If not half of array(A)'s size, return -1.
		if (max <= A.length / 2) {
			return -1;
		}
		// Find any index of num.
		for (int idx = 0; idx < A.length; idx++) {
			if (A[idx] == num) {
				return idx;
			}
		}
		return -1;
	}

}
