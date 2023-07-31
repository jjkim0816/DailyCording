class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
		for (int i = pat.length() - 1, j = 0; i < myString.length(); i++, j++) {
			if (myString.substring(j, j + pat.length()).equals(pat)) {
				answer += 1;
			}
		}

        return answer;
    }
}