package gracefulsoul.lesson07;

import java.util.Stack;

public class StoneWall {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {8,8,5,7,9,8,7,4,8}));
	}

	// https://app.codility.com/demo/results/trainingJSWNH2-6PS/
	public static int solution(int[] H) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		for(int height : H) {
			while (!stack.isEmpty() && stack.peek() > height) {
				stack.pop(); // Remove higher than new stone wall.
			}
			if (stack.isEmpty() || stack.peek() < height) {
				stack.push(height); // Add new stone wall.
				result++;
			}
		}
		return result;
	}
	
}
