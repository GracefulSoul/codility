package gracefulsoul.lesson07;

import java.util.Stack;

public class Brackets {

	public static void main(String[] args) {
		System.out.println(solution("{[()()]}"));
		System.out.println(solution("([)()]"));
	}
	
	// https://app.codility.com/demo/results/trainingPUXTG6-DW7/
	private static int solution(String S) {
		Stack<Character> stack = new Stack<>();
		for (char c : S.toCharArray()) {
			switch (c) {
				case '(': case '{': case '[':
					stack.push(c);
					break;
				case ')':
					if (stack.size() == 0 || stack.pop() != '(') {
						return 0;
					}
					break;
				case '}':
					if (stack.size() == 0 || stack.pop() != '{') {
						return 0;
					}
					break;
				case ']':
					if (stack.size() == 0 || stack.pop() != '[') {
						return 0;
					}
					break;
			}
		}
		return stack.isEmpty() ? 1 : 0;
	}

}
