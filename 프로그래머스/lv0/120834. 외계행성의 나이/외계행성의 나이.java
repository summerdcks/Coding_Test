import java.util.*;
class Solution {
    public String solution(int age) {
        String answer = "";
        String ag = String.valueOf(age);
        for(char c : ag.toCharArray()) {
            answer += (char)((int)c+49);
        }
        return answer;
    }
}