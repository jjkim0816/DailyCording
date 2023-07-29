class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";		char[] result = my_string.toCharArray();

		for (int[] query : queries) {
			char[] temp = new char[query[1] - query[0] + 1];
			for (int i = query[0], j = 0; i <= query[1]; i++, j++) {
				temp[j] = result[i];
			}
			for (int i = 0, j = query[1]; i < temp.length; i++, j--) {
				result[j] = temp[i];
			}
		}

		answer = String.valueOf(result);
        return answer;
    }
}