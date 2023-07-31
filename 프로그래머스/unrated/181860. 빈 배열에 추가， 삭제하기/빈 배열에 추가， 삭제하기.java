import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) {
				for (int j = 0; j < arr[i] * 2; j++)
					sb.append(arr[i]);
			} else {
				sb.delete(sb.length() - arr[i], sb.length());
			}
		}

		answer = Arrays.stream(sb.toString().split("")).mapToInt(Integer::parseInt).toArray();

        return answer;
    }
}