class Solution {
    public String solution(String n_str) {
        String answer = "";
        int count = 0;
        for(char c : n_str.toCharArray()) {
            if(count == 0) {
                if(c != '0') {
                    count++;
                    answer += c;
                } 
            } else {
                answer += c;
            }
        }
        return answer;
    }
}