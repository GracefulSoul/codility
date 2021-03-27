package gracefulsoul.lesson13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class FibFrog {
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {0,0,0,1,1,0,1,0,0,0,0}));
	}

	private static final Map<Integer, Integer> fibonacciMap = new HashMap<>();

	// https://app.codility.com/demo/results/trainingGA625V-EFE/
	public static int solution(int[] A) {
		for (int idx = 0; getFibonacciData(idx) <= A.length + 1; idx++) {
			getFibonacciData(idx);
		}

		List<Integer> fibonacciList = new ArrayList<>(fibonacciMap.values());
		Collections.reverse(fibonacciList);

		Queue<Point> queue = new LinkedList<>();
		boolean[] check = new boolean[A.length + 1];

		queue.add(new Point(-1, 0)); // Starting point.

		while (!queue.isEmpty()) {
			Point currentPoint = queue.poll();
			for (int fibonacci : fibonacciList) {
				int next = currentPoint.getPosition() + fibonacci;
				if (next == A.length) {
					return currentPoint.getJump() + 1;
				} else if (next < A.length && next >= 0) {
					if (A[next] == 1 && !check[next]) {
						check[next] = true;
						queue.add(new Point(next, currentPoint.getJump() + 1));
					}
				}
			}
		}
		return -1;
	}

	public static int getFibonacciData(int num) {
		if (num <= 1) {
			return num;
		}
		if (fibonacciMap.containsKey(num)) {
			return fibonacciMap.get(num);
		} else {
			int temp = getFibonacciData(num - 2) + getFibonacciData(num - 1);
			fibonacciMap.put(num, temp);
			return temp;
		}
	}

	static class Point {
		private int position;
		private int jump;
		public Point(int position, int jump) {
			this.position = position;
			this.jump = jump;
		}
		public int getPosition() {
			return position;
		}
		public int getJump() {
			return jump;
		}
	}

}
