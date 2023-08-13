import java.util.Collections;
import java.util.LinkedList;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        LinkedList<Integer> list = new LinkedList<>();
		for (int i : priorities)
			list.add(i);

		while (true) {
			int max = Collections.max(list);

			if (list.get(0) == max) {
				answer++;
				list.remove();

				if (location == 0) {
					break;
				} else {
					location--;
				}
			} else {
				list.add(list.poll());
				location--;
				if (location < 0)
					location = list.size() - 1;
			}
		}
        
        return answer;
    }
}