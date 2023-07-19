import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        if((int)Math.sqrt(n) == (double)Math.sqrt(n)) {
            answer = (long)(Math.sqrt(n) + 1) * (long)(Math.sqrt(n) + 1);
        } else {
            answer = -1;
        }
        return answer;
    }
}