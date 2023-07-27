import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        int[] rankOrder = new int[3];
        Collections.sort(keySet);
        
		for (int i = 0; i < 3; i++) {
			rankOrder[i] = map.get(keySet.get(i));
		}
        
        answer = 10000 * rankOrder[0] + 100 * rankOrder[1] + rankOrder[2];
        
        return answer;
    }
}