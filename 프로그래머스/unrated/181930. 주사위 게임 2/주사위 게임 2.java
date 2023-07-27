import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 1;
        int[] intArrays = {a, b, c};
        
        int distinctCount = (int) (Arrays.stream(intArrays).distinct().count());
        
		for (int i = 1; i <= (intArrays.length + 1) - distinctCount; i++) {
			answer *= (int) (Math.pow(a, i) + Math.pow(b,  i) + Math.pow(c, i));
		}
		
        return answer;
    }
}