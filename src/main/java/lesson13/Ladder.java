package lesson13;

public class Ladder {

	public static void main(String[] args) {
		solution(new int[] {4,4,5,5,1}, new int[] {3,2,4,3,1});
	}
	
	// https://app.codility.com/demo/results/training2QCZB4-ZTQ/
	public static int[] solution(int[] A, int[] B) {
		int[] result = new int[A.length];
		int[] fibonacci = getFibonacci(A.length);
		for (int idx = 0; idx < A.length; idx++) {
			result[idx] = fibonacci[A[idx]] % (1 << B[idx]);
		}
		return result;
	}
	
	private static int[] getFibonacci(int length) {
		int[] fibonacci = new int[length + 2];
		fibonacci[1] = 1;
		fibonacci[2] = 2;
		for (int idx = 3; idx <= length; idx++) {
			fibonacci[idx] = (fibonacci[idx - 2] + fibonacci[idx - 1]) % (1 << 30);
		}
		return fibonacci;
	}

}
