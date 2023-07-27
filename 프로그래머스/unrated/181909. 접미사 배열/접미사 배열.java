import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<String>();
        
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        list.sort(Comparator.naturalOrder());
        
        answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}