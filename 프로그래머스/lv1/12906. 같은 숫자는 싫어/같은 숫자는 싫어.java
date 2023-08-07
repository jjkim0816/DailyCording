import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<Integer>();

		for (int n : arr) {
			if (stack.isEmpty()) {
				stack.push(n);
				continue;
			}

			if ((int) stack.peek() != n)
				stack.push(n);
		}

		answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}