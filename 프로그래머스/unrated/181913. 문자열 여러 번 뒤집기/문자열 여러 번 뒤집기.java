class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";		
		StringBuilder resultSb = new StringBuilder(my_string);
		for (int[] query : queries) {
			StringBuilder sb = new StringBuilder(resultSb.substring(query[0], query[1] + 1));
			sb.reverse();
			resultSb.replace(query[0], query[1] + 1, sb.toString());
		}

		answer = resultSb.toString();
        
        return answer;
    }
}