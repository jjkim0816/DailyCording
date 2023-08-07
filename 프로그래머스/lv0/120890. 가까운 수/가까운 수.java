import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
		Arrays.sort(array);
		int minN = 1000;

		for (int x : array) {
			if (Math.abs(x - n) < minN) {
				minN = Math.abs(x - n);
				answer = x;
			}
		}

        return answer;
    }
}