class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int first = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
		int second = 2 * a * b;
		
		answer = first > second ? first : second;
        
        return answer;
    }
}