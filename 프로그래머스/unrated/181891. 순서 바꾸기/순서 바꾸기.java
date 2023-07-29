import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        int[] first = IntStream.range(n, num_list.length).map(idx -> num_list[idx]).toArray();
        int[] second = IntStream.range(0,n).map(idx -> num_list[idx]).toArray();
        
        answer = IntStream.concat(IntStream.of(first), IntStream.of(second)).toArray();
        
        return answer;
    }
}