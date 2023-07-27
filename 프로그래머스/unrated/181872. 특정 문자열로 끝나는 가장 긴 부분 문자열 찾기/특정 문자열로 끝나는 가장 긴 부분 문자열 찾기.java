class Solution {
    public String solution(String myString, String pat) {
        Integer lastIndex = myString.lastIndexOf(pat);
        String answer = myString.substring(0, lastIndex) + pat;
        return answer;
    }
}