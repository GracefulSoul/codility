package gracefulsoul.lesson05;

public class PassingCars {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {0,1,0,1,1}));
	}
	
	// https://app.codility.com/demo/results/trainingSVXSS6-HYF/
	private static int solution(int[] A) {
        int count = 0;
        int result = 0;
        for (int num : A) {
            if (num == 0) {
            	count++;
            } else {
                result += count;
            }
            // If passing cars exeeds 1,000,000,000, return -1.
            if (result > 1000000000) {
                return -1;
            }
        }
        return result;
	}

}
