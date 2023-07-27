import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        for (int i:arr) {
            for (int j = 0; j < i; j++) {
                list.add(i);
            }    
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).intValue();
        }
        
        return answer;
    }
}