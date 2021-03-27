package gracefulsoul.lesson10;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,3,4,1,2,3,4,6,2}));
	}

	// https://app.codility.com/demo/results/trainingUWAGT4-4RJ/
	public static int solution(int[] A) {
		List<Integer> peaks = getPeaks(A);
		for (int idx = A.length; idx >= 1; idx--) {
			if (A.length % idx == 0) {
				int blockSize = A.length / idx;
				int blockCount = 0;
				for (int peakIndex : peaks) {
					if (peakIndex / blockSize == blockCount) {
						blockCount++;
					}
				}
				if (blockCount == idx) {
					return blockCount;
				}
			}
		}
		// If A cannot be divided into some number of blocks, the function should return 0.
        return 0;
	}

	private static List<Integer> getPeaks(int[] A) {
		List<Integer> peaks = new ArrayList<>();
		for (int idx = 1; idx < A.length - 1; idx++) {
			if (A[idx - 1] < A[idx] && A[idx] > A[idx + 1]) {
				peaks.add(idx);
			}
		}
		return peaks;
	}

}
