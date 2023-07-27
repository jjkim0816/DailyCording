class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String oddNumberStr = "";
		String evenNumberStr = "";
        
        for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 != 0) {
				oddNumberStr += Integer.toString(num_list[i]);
			} else {
				evenNumberStr += Integer.toString(num_list[i]);
			}
        }
        
        answer = Integer.parseInt(evenNumberStr) + Integer.parseInt(oddNumberStr);
        
        return answer;
    }
}