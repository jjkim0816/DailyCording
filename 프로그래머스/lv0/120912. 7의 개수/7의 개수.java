import java.util.stream.Stream;

class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int arr : array) {
			int[] digits = Stream.of(String.valueOf(arr).split("")).mapToInt(Integer::parseInt).toArray();
			for (int digit : digits) {
				if (digit == 7)
					answer++;
			}
		}

        return answer;
    }
}