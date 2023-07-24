import java.util.*;
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        Arrays.sort(array);
        for(int num : array) {
            if(num > height) {
                answer++;
            }
        }
        return answer;
    }
}