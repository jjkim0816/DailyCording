class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for (int i = 0; i < queries.length; i++) {
			int firstQuery = queries[i][0];
			int secondQuery = queries[i][1];
			int firstQueryValue = arr[firstQuery];
			int secondQueryValue = arr[secondQuery];
			arr[firstQuery] = secondQueryValue;
			arr[secondQuery] = firstQueryValue;
		}
		
		answer = arr.clone();
        
        return answer;
    }
}