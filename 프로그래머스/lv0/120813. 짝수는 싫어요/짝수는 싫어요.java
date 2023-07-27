import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1)
				list.add(i);
		}

		answer = new int[list.toArray().length];

		for (int i = 0; i < list.toArray().length; i++) {
			answer[i] = list.get(i).intValue();
		}
        return answer;
    }
}