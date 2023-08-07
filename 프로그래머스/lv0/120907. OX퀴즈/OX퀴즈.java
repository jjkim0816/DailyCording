class Solution {
    public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		
		for (int i = 0; i < quiz.length; i++) {
			String[] seq = quiz[i].split(" ");

			switch(seq[1]) {
			case "+":
				answer[i] = Integer.parseInt(seq[0]) + Integer.parseInt(seq[2]) == Integer.parseInt(seq[4]) ? "O" : "X";
				break;
			case "-":
				answer[i] = Integer.parseInt(seq[0]) - Integer.parseInt(seq[2]) == Integer.parseInt(seq[4]) ? "O" : "X";
				break;
			}
		}
        return answer;
    }
}