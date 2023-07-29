import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> idxList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				idxList.add(i);
			}
		}
        
   		if (idxList.isEmpty()) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}

		int minIdx = Collections.min(idxList);
		int maxIdx = Collections.max(idxList);

		answer = Arrays.copyOfRange(arr, minIdx, maxIdx + 1);
        
        return answer;
    }
}