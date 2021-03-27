package gracefulsoul.lesson05;

public class MinAvgTwoSlice {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {4,2,2,5,1,5,8}));
	}
	
	// https://app.codility.com/demo/results/training8NYBNN-9FU/
	private static int solution(int[] A) {
		double minimumAverage = (A[0] + A[1]) / 2.0d;
        int result = 0;
        for (int idx = 2; idx < A.length; idx++) {
        	double average = (A[idx - 2] + A[idx - 1] + A[idx]) / 3.0d;
        	if (minimumAverage > average) {
        		minimumAverage = average;
        		result = idx - 2;
        	}
        	average = (A[idx - 1] + A[idx]) / 2.0d;
        	if (minimumAverage > average) {
        		minimumAverage = average;
        		result = idx - 1;
        	}
        }
        return result;
    }

}
