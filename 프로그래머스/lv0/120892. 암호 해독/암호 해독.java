class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
		String[] cipherArray = cipher.split("");

		for (int i = 0; i <= cipherArray.length; i++) {
			if (i != 0 && (i % code) == 0) {
				answer += cipherArray[i - 1];
			}
		}

        return answer;
    }
}