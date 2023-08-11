import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
       	ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}

		if (!list.isEmpty()) {
			answer = list.stream().mapToInt(Integer::intValue).sorted().toArray();
		} else if (list.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
		}

        return answer;
    }
}