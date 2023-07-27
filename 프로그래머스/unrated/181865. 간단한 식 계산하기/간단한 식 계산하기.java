class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] binomials = binomial.split(" ");
        
        int front = Integer.parseInt(binomials[0]);
        String operator = binomials[1];
        int end = Integer.parseInt(binomials[2]);
        
        switch(operator) {
            case "+":
                answer = front + end;
                break;
            case "-":
                answer = front - end;
                break;
            case "*":
                answer = front * end;
                break;
            case "/":
                answer = front / end;
                break;
            case "%":
                answer = front % end;
                break;
            default:
                answer = 0;
        }
        
        return answer;
    }
}