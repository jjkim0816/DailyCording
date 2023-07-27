import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        answer = new int[k];
        IntStream.of(arr).distinct().forEach(data -> list.add(data));
        
        for (int i = 0; i < k; i++) {
            if (i < list.size()) {
                answer[i] = list.get(i).intValue();
            } else {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}