import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        
        answer = Arrays.stream(myString.split("x")).filter(data -> !data.isEmpty()).sorted().toArray(String[]::new);
        
        return answer;
    }
}