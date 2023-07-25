class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0 ; i < my_string.length(); i++) {
            if((int)my_string.charAt(i) > (int)'Z') {
                answer += String.valueOf(my_string.charAt(i)).toUpperCase();
            } else {
                answer += String.valueOf(my_string.charAt(i)).toLowerCase();
            }
            
        }
        return answer;
    }
}