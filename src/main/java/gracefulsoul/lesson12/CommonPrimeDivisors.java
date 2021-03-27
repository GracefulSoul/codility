package gracefulsoul.lesson12;

public class CommonPrimeDivisors {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {15,10,3}, new int[] {75,30,5}));
	}
	
	// https://app.codility.com/demo/results/trainingHCMKR3-3PJ/
	public static int solution(int[] A, int[] B) {
		int result = 0;
		for (int idx = 0; idx < A.length; idx++) {
			if (isSameDivisors(A[idx], B[idx])) {
				result++;
			}
		}
		return result;
	}
	
	// Check whether the sets of prime divisors of integers N and M are exactly the same.
	private static boolean isSameDivisors(int num1, int num2) {
		int gcd = getGcd(num1, num2);
		return getDivisor(gcd, num1) == 1 && getDivisor(gcd, num2) == 1;
	}
	
	private static int getDivisor(int gcd, int num) {
		int quotient = 0;
		while (quotient != 1) {
			quotient = getGcd(num, gcd);
			num /= quotient;
		}
		return num;
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
