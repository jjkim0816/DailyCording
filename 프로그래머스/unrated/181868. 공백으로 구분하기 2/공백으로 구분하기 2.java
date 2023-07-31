import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        answer = answer = Arrays.stream(my_string.split(" ")).filter(data -> !data.isEmpty()).toArray(String[]::new);
        
        return answer;
    }
}