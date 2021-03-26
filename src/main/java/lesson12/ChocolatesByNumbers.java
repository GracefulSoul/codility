package lesson12;

public class ChocolatesByNumbers {

	public static void main(String[] args) {
		System.out.println(solution(10, 4));
	}
	
	// https://app.codility.com/demo/results/training2XBK6X-U2F/
	private static int solution(int N, int M) {
		return N / getGcd(M, N);
	}
	
	// Euclidean algorithm.
	private static int getGcd(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		} else {
			return getGcd(num2, num1 % num2);
		}
	}

}
