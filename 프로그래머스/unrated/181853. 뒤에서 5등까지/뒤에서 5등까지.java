import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        answer = IntStream.of(num_list).sorted().toArray();
        answer = Arrays.copyOfRange(answer, 0, 5);
        
        return answer;
    }
}