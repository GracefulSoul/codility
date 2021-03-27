package gracefulsoul.lesson08;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class EquiLeader {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {4,3,4,4,4,2}));
	}
	
	// https://app.codility.com/demo/results/trainingT4DHJ8-XJZ/
	private static int solution(int[] A) {
		Vector<Integer> record = getRecord(A);
		int result = 0;
		for (int idx = 0; idx < A.length; idx++) {
			int left = record.elementAt(idx);
			int right = record.lastElement() - left;
			int equiOne = ((idx + 1) / 2) + 1;
			int equiTwo = ((A.length - (idx + 1)) / 2) + 1;
			if ((left >= equiOne) && (right >= equiTwo)) {
				result++;
			}
		}
		return result;
	}
	
	private static Vector<Integer> getRecord(int[] A) {
		Vector<Integer> record = new Vector<>();
		int leader = getLeader(A);
		int count = 0;
		for (int num : A) {
			if (num == leader) {
				count++;
			}
			record.add(count);
		}
		return record;
	}
	
	private static int getLeader(int[] A) {
		Map<Integer, Integer> map = new HashMap<>();
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
		return num;
	}

}
