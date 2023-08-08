class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";

        int bin1ToDecimal = Integer.parseInt(bin1, 2);
		int bin2ToDecimal = Integer.parseInt(bin2, 2);

		answer = Integer.toBinaryString(bin1ToDecimal + bin2ToDecimal);
        
        return answer;
    }
}