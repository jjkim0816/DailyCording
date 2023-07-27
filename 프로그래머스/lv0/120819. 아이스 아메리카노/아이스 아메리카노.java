class Solution {
    public int[] solution(int money) {
        int[] answer = {};
   		final int priceAmericano = 5500;
		answer = new int[2];

		answer[0] = money / priceAmericano;
		answer[1] = money % priceAmericano;

        return answer;
    }
}