class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        final int yang = 12000;
		final int beverage = 2000;
		final int service = 10;

		int serviceBeverageCount = n / service;

		answer = n * yang + (k - serviceBeverageCount) * beverage;
        return answer;
    }
}