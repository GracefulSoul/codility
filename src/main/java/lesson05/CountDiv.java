package lesson05;

public class CountDiv {

	public static void main(String[] args) {
		System.out.println(solution(6, 11, 2));
	}
	
	// https://app.codility.com/demo/results/trainingSC57UB-3PR/
	private static int solution(int A, int B, int K) {
		if (A == 0) {
			return (B / K) + 1;
		} else {
			return (B / K) - ((A - 1) / K);
		}
    }

}
