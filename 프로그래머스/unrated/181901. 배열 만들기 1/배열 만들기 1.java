class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        for (int i = 0, j = 1; i < (n/k); i++, j++) {
            answer[i] = j * k;
        }
        
        return answer;
    }
}