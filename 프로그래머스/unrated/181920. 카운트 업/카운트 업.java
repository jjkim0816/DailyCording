class Solution {
    public int[] solution(int start, int end) {
        int[] answer = {};
        answer = new int[(end - start) + 1];
        
        for (int i = 0; i < answer.length; i++) {
            if (i == 0) {
                answer[i] = start;
            } else {
                answer[i] = answer[i - 1] + 1;
            }
        }
        
        return answer;
    }
}