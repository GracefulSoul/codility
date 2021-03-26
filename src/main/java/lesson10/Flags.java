package lesson10;

public class Flags {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}));
	}
	
	// https://app.codility.com/demo/results/trainingUE4UWX-DGQ/
	private static int solution(int[] A) {
		int result = 0;
		// Check to peak's index.
		boolean[] peaks = getPeaks(A);
		// Check to next peak's index.
		int[] nextPeaks = getNextPeaks(peaks);
		// Calculate count of peaks.
		for (int idx = 1; idx < A.length; idx++) {
			if (isPossibleToSetOnPeak(nextPeaks, idx)) {
				result = Math.max(result, idx);
			}
		}
		return result;
	}
	
	private static boolean[] getPeaks(int[] A) {
		boolean[] peaks = new boolean[A.length];
		for (int idx = 1; idx < A.length - 1; idx++) {
			if (A[idx] > A[idx - 1] && A[idx] > A[idx + 1]) {
				peaks[idx] = true;
			}
		}
		return peaks;
	}
	
	private static int[] getNextPeaks(boolean[] peaks) {
		int[] nextPeaks = new int[peaks.length];
		int nextPeak = -1;
		for (int idx = nextPeaks.length - 1; idx >= 0; idx--) {
			if (peaks[idx]) {
				nextPeak = idx;
			}
			nextPeaks[idx] = nextPeak;
		}
		return nextPeaks;
	}
	
	private static boolean isPossibleToSetOnPeak(int[] nextPeaks, int point) {
		int index = 0;
		for (int idx = 0; idx < point; idx++) {
			if (index >= nextPeaks.length || nextPeaks[index] < 0) {
				return false;
			}
			index = nextPeaks[index] + point;
		}
		return true;
	}

}
