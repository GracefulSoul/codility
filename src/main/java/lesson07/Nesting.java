package lesson07;

import java.util.Stack;

public class Nesting {

	public static void main(String[] args) {
		System.out.println(solution("(()(())())"));
		System.out.println(solution("())"));
	}
	
	// https://app.codility.com/demo/results/trainingQQN37J-34Z/
	private static int solution(String S) {
		Stack<Character> stack = new Stack<>();
		for (char c : S.toCharArray()) {
			switch (c) {
				case '(':
					stack.push(c);
					break;
				case ')':
					if (stack.isEmpty() || stack.pop() != '(') {
						return 0;
					}
				default:
					break;
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}

}
