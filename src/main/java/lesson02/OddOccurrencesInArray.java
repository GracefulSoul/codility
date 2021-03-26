package lesson02;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {9,3,9,3,9,7,9}));
	}
	
	// https://app.codility.com/demo/results/trainingPK5C7W-QF2/
	private static int solution(int[] A) {
		int result = 0;
        for (int num : A) {
        	// Using bit operation.
            result ^= num;
        }
        return result;
	}

}
