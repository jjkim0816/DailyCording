import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();

		for (int[] interval : intervals) {
			for (int i = interval[0]; i <= interval[1]; i++) {
				list.add(arr[i]);
			}
		}

		answer = list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}