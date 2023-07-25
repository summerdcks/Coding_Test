import java.util.*;
class Solution {
    public int solution(String number) {
        int sum = 0;
        for(int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        int answer = sum % 9;
        return answer;
    }
}