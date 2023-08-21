class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
		int moveInt = 0;

		if (direction.equals("right")) {
			moveInt = numbers[numbers.length - 1];
			for (int i = 1; i < numbers.length; i++) {
				answer[i] = numbers[i - 1];
			}
			answer[0] = moveInt;
		} else if (direction.equals("left")) {
			moveInt = numbers[0];
			for (int i = 0; i < numbers.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
			answer[numbers.length - 1] = moveInt;
		}
        return answer;
    }
}