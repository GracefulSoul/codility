package lesson06;

import java.util.Arrays;

public class Distinct {
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,1,1,2,3,1}));
	}
	
	// https://app.codility.com/demo/results/trainingBUTFHG-DS3/
	public static int solution(int[] A) {
		return (int) Arrays.stream(A).distinct().count();
	}

}
