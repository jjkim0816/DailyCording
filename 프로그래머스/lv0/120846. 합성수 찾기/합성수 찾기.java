class Solution {
    public int solution(int n) {
        int answer = 0;
        int measureCount = 0;

		for (int i = 4; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					measureCount++;
			}

			if (measureCount >= 3) {
				answer++;
				measureCount = 0;
			}
		}
        
        return answer;
    }
}