class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
		boolean isLogin = false, isWrongPw = false, isFail = false;

		for (String[] items : db) {
			if (items[0].equals(id_pw[0]) && items[1].equals(id_pw[1])) {
				isLogin = true;
				break;
			} else if (items[0].equals(id_pw[0]) && !items[1].equals(id_pw[1])) {
				System.out.println("123123");
				isWrongPw = true;
			} else {
				isFail = true;
			}
		}

		if (isLogin)
			answer = "login";
		else if (isWrongPw)
			answer = "wrong pw";
		else if (isFail)
			answer = "fail";
        
        return answer;
    }
}