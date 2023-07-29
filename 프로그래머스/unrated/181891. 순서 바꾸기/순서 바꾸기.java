import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        int[] firstArray = IntStream.range(n, num_list.length).map(idx -> num_list[idx]).toArray();
        int[] secondArray = IntStream.range(0,n).map(idx -> num_list[idx]).toArray();
        
        answer = IntStream.concat(IntStream.of(firstArray), IntStream.of(secondArray)).toArray();
        
        return answer;
    }
}
