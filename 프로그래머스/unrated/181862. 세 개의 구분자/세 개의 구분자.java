import java.util.List;
import java.util.ArrayList;

class Solution {
    private static String[] solutionSep(String myStr) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if (c == 'a' || c == 'b' || c == 'c') {
                if (current.length() > 0) {
                    result.add(current.toString());
                    current = new StringBuilder();
                }
            } else {
                current.append(c);
            }
        }

        if (current.length() > 0) {
            result.add(current.toString());
        }

        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        } else {
            return result.toArray(new String[0]);
        }
    }
    
    public String[] solution(String myStr) {
        String[] answer = solutionSep(myStr);
        return answer;
    }
}