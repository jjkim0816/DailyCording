import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();
		boolean check = false;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < delete_list.length; j++) {
				if (arr[i] == delete_list[j]) {
					check = true;
				}
			}

			if (!check) {
				list.add(arr[i]);
			}

			check = false;

		}

		answer = list.stream().mapToInt(value -> value).toArray();
        return answer;
    }
}