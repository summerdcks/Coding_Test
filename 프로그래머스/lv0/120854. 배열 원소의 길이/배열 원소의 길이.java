import java.util.*;
class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        for(int i = 0; i < strlist.length; i++) {
            char[] c = strlist[i].toCharArray();
            answer[i] = c.length;
        }
        return answer;
    }
}