class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (int i = 0; i < myString.length(); i++) {
            answer += (myString.charAt(i) == 'a' || myString.charAt(i) == 'A')? Character.toUpperCase(myString.charAt(i)) : Character.toLowerCase(myString.charAt(i));
        }
        
        return answer;
    }
}