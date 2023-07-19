import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String number = Integer.toString(n);
     
        for(int i = 0; i < number.length(); i++) {
            answer += Character.getNumericValue(number.charAt(i));
        }
        return answer;
    }
}