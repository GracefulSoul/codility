package gracefulsoul.lesson10;

public class MinPerimeterRectangle {

	public static void main(String[] args) {
		System.out.println(solution(30));
	}
	
	// https://app.codility.com/demo/results/trainingQ26K5H-P53/
	private static int solution(int N) {
		int minimum = Integer.MAX_VALUE;
		for (int idx = 1; idx <= Math.sqrt(N); idx++) {
			if (N % idx == 0) {
				int calculate = 2 * (idx + (N / idx));
				if (minimum > calculate) {
					minimum = calculate;
				}
			}
		}
		return minimum;
	}

}
