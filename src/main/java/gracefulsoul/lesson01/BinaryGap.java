package gracefulsoul.lesson01;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(9));
		System.out.println(solution(1041));
		System.out.println(solution(32));
	}
	
	// https://app.codility.com/demo/results/trainingE5EF2K-44N/
	private static int solution(int N) {
        char[] binary = Integer.toBinaryString(N).toCharArray();
        int max = 0;
        int counter = 0;
        // Loop and check max length.
        for (int idx = 1; idx < binary.length; idx++) {
            if(binary[idx] == '0') {
                counter++;
            } else {
                if (counter > max) {
                    max = counter;
                }
                // Initializing counter.
                counter = 0;
            }
        }
        return max;
	}
	
}
