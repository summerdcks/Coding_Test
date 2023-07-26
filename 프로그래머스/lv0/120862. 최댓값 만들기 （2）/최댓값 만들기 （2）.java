import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = -999999999;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if(i != j) {
                    answer = Math.max(answer, numbers[i] * numbers[j]);
                }
            }
        }
        return answer;
    }
}