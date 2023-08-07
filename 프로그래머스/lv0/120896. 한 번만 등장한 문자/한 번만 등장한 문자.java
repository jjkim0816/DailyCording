import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
		ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
		String[] distinctS = Arrays.stream(s.split("")).distinct().sorted().toArray(String[]::new);

		for (int i = 0; i < distinctS.length; i++) {
			if (Collections.frequency(list, distinctS[i]) == 1) {
				answer += distinctS[i];
			}
		}

        return answer;
    }
}