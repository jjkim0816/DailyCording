import java.util.Arrays;
import java.util.stream.Stream;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        int[] orderDigit = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();
        
        answer = (int) Arrays.stream(orderDigit).filter(data -> data != 0 && data % 3 == 0).count();
        
        return answer;
    }
}