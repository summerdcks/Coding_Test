import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String number = "";
        for(int i = c.length -1; i >= 0 ; i--) {
            number = number + c[i];
        }
        answer = Long.parseLong(number);
        return answer;
    }
}