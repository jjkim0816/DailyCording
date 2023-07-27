class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
       StringBuilder sb = new StringBuilder(my_string);
		
		for (int i = 0, j = s; i < overwrite_string.length(); i++, j++) {
			sb.setCharAt(j, overwrite_string.charAt(i));
		}
		
		answer = sb.toString();
        
        return answer;
    }
}