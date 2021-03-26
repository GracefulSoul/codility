package lesson10;

public class CountFactors {

	public static void main(String[] args) {
		System.out.println(solution(24));
	}
	
	// https://app.codility.com/demo/results/trainingWRXP78-3U7/
	private static int solution(int N) {
		if (N == 1) {
			return N;
		}
		int result = 1;
		for (int idx = 2; idx < Math.sqrt(N); idx++) {
			if (N % idx == 0) {
				result++;
			}
		}
		result = result * 2;
		if (Math.sqrt(N) % 1 == 0) {
			result++;
		}
		return result;
	}

}
