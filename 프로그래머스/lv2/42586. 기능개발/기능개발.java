import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
		Queue<Integer> remainingPeriod = new LinkedList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			remainingPeriod.add((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
		}
		System.out.println(remainingPeriod);

		while (!remainingPeriod.isEmpty()) {
			int current = remainingPeriod.poll();
			int count = 1;

			while (!remainingPeriod.isEmpty() && remainingPeriod.peek() <= current) {
				count++;
				remainingPeriod.poll();
			}

			result.add(count);
		}

		answer = result.stream().mapToInt(data -> data).toArray();
        return answer;
    }
}