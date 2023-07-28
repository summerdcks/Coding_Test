import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        Arrays.sort(b);
        Arrays.sort(a);
        if(String.valueOf(a).equals(String.valueOf(b))) {
            answer = 1;
        }
        return answer;
    }
}