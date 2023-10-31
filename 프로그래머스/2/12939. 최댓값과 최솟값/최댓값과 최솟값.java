import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < str.length; i++) {
            int temp = Integer.parseInt(str[i]);
            if(max < temp) max = temp;
            if(min > temp) min = temp;
        }
        String answer = min + " " + max;
        return answer;
    }
}