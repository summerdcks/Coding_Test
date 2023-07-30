class Solution {
    public int solution(String binomial) {
        String[] str = binomial.split(" ");
        int answer = 0;
        if(str[1].equals("+")) {
            answer = Integer.parseInt(str[0]) + Integer.parseInt(str[2]);
        } else if(str[1].equals("-")) {
            answer = Integer.parseInt(str[0]) - Integer.parseInt(str[2]);
        } else if(str[1].equals("*")) {
            answer = Integer.parseInt(str[0]) * Integer.parseInt(str[2]);
        }
        return answer;
    }
}