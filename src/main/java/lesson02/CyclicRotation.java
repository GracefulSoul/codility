package lesson02;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		print(solution(new int[] {3,8,9,7,6}, 3));
		print(solution(new int[] {1,2,3,4}, 4));
	}
	
	// https://app.codility.com/demo/results/trainingUWMRMK-AWK/
	private static int[] solution(int[] A, int K) {
        int length = A.length;
        int[] result = new int[length];
        // Repeat the size of array A.
        for (int idx = 0; idx < length; idx++) {
            result[(idx + K) % length] = A[idx];
        }
        return result;
	}
	
	private static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}

}
