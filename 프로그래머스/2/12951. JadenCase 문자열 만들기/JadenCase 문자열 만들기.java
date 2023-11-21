import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char temp = s.charAt(0);
        answer += String.valueOf(temp).toUpperCase();
        for(int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(temp == ' ') {
                answer += String.valueOf(c).toUpperCase();
            }
            if(temp != ' ') {
                answer += String.valueOf(c).toLowerCase();
            }
            temp = c;
        }
        return answer;
    }
}