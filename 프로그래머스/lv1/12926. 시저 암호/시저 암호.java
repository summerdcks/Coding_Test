import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        for(int i = 0 ; i < ch.length; i++) {
            if(ch[i] == ' ') {
                
            } else {
                if(((int)ch[i] < 91 && (int)ch[i] + n > 90)|| (int)ch[i] + n > 122) {
                    ch[i] = (char)((int)ch[i] + n - 26);
                } else {
                    ch[i] = (char)((int)ch[i] + n);
                }
            }
        }
        answer= String.valueOf(ch);
        return answer;
    }
}