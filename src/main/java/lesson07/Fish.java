package lesson07;

import java.util.Stack;

public class Fish {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {4,3,2,1,5}, new int[] {0,1,0,0,0}));
	}
	
	// https://app.codility.com/demo/results/training8R277U-FU3/
	private static int solution(int[] A, int[] B) {
		Stack<Integer> stack = new Stack<>();
		int lastSize = 0;
		int aliveCount = 0;
		for (int idx = 0; idx < A.length; idx++) {
			if (B[idx] == 1) {
				stack.add(A[idx]);
			} else {
				// Check to fish size.
				while (!stack.isEmpty()) {
					lastSize = stack.peek();
					if (lastSize < A[idx]) {
						stack.pop();
					} else {
						break;
					}
				}
				if (stack.isEmpty()) {
					aliveCount++;
				}
			}
		}
		return aliveCount + stack.size();
	}

}
