import java.util.Arrays;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
		final String removeKey = "ad";

		answer = Arrays.stream(strArr).filter(data -> data.contains(removeKey) == false).toArray(String[]::new);
        return answer;
    }
}