class Solution {
    public int solution(int n) {
        int answer = 0;
        int end = 2;
		int value = 1;

		while (true) {
			for (int i = 1; i <= end; i++) {
				value *= i;
			}

			if (value > n) {
				answer = end - 1;
				break;
			}

			value = 1;
			end++;
		}

        return answer;
    }
}