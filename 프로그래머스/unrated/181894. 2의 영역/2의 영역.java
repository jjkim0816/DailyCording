import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int[] idx = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
        
        if (idx.length == 0)
            return new int[] {-1};
        
        answer = IntStream.rangeClosed(idx[0], idx[idx.length - 1]).map(i -> arr[i]).toArray();
        
        return answer;
    }
}