class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for (int[] subQueries: queries) {
			for (int i = subQueries[0]; i <= subQueries[1]; i++) {
				if (i % subQueries[2] == 0) {
					arr[i] += 1;
				}
			}
		}
        
        answer = arr.clone();
        
        return answer;
    }
}