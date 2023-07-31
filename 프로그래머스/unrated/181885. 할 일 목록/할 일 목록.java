import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = IntStream.range(0, todo_list.length).filter(idx -> finished[idx] != true).mapToObj(notFinishIdx -> todo_list[notFinishIdx]).toArray(String[]::new);
	
        return answer;
    }
}