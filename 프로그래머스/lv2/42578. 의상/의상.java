import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (String[] clothe : clothes) {
			if (hm.containsKey(clothe[1])) {
				int temp = hm.get(clothe[1]) + 1;
				hm.put(clothe[1], temp);
			} else {
				hm.put(clothe[1], 1);
			}
		}
		
		for (int value : hm.values()) {
			answer *= (value + 1);
		}
		
		answer -= 1;
        
        return answer;
    }
}