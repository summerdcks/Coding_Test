import java.util.*;
class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] c = my_string.toCharArray();
        char num11 = c[num1];
        char num22 = c[num2];
        for(int i = 0; i < c.length; i++) {
            if(i != num1 && i != num2) {
                answer += c[i];
            } else if(i == num1) {
                answer += num22;
            } else if(i == num2) {
                answer += num11;
            }
        }
        return answer;
    }
}