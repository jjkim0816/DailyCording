import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = l; i <= r; i++) {
			String numberToCharArr = String.valueOf(i);
			if (numberToCharArr.matches("^[05]+$")) {
				list.add(Integer.parseInt(numberToCharArr));
			}
		}

		if (!list.isEmpty()) {
			answer = list.stream().mapToInt(Integer::intValue).toArray();
		} else {
			answer = new int[1];
			answer[0] = -1;
		}
        
        return answer;
    }
}