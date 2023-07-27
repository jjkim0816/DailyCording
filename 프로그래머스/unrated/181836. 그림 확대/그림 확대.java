class Solution {
    public String[] solution(String[] picture, int k) {		String[] answer = new String[picture.length * k];
		int index = 0;
		
		for (int i = 0; i < picture.length; i++) {

			for (int n = 0; n < k; n++) {
				String pictureElement = picture[i];
				String row = "";

				for (int j = 0; j < pictureElement.length(); j++) {
					StringBuilder sb = new StringBuilder();

					for (int m = 0; m < k; m++) {
						sb.append(pictureElement.charAt(j));
					}

					row += sb.toString();

				}

				answer[index] = row;
				index++;
			}

		}
                                                       
        return answer;
    }
}