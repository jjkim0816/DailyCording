import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
		List<String> list = new ArrayList<String>();

		int[] notFinishedArray = IntStream.range(0, todo_list.length).filter(idx -> finished[idx] != true).toArray();
		for (int i = 0; i < notFinishedArray.length; i++) {
			list.add(todo_list[notFinishedArray[i]]);
		}

		answer = list.stream().toArray(String[]::new);

        return answer;
    }
}