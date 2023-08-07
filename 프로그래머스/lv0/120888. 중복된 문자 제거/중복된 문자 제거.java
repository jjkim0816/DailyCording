import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
		String[] my_array = Arrays.stream(my_string.split("")).distinct().toArray(String[]::new);

		answer = Arrays.stream(my_array).collect(Collectors.joining());
        
        return answer;
    }
}