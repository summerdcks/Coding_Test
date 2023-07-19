import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++) {
            for(int j = i; j >= 0; j--) {
                if(c[i] == c[j]) {
                    answer[i] = i-j;
                    if(i == j) {
                        answer[i] = -1;
                    } else if( i != j) {
                        break;
                    }
                }
            }
        }
        return answer;
    }
}