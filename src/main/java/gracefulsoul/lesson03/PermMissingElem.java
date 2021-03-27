package gracefulsoul.lesson03;

public class PermMissingElem {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {2,3,1,5}));
	}
	
	// https://app.codility.com/demo/results/trainingMBK8M8-JET/
	public static int solution(int[] A) {
        int difference = A.length + 1;
		for (int idx = 0; idx < A.length; idx++) {
			difference += (idx + 1) - A[idx];
        }
		return difference;
    }

}
