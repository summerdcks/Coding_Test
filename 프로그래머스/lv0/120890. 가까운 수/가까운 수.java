import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer =100;
        Arrays.sort(array);
        int num = 100;
        for(int i=0;i<array.length;i++) {    
            if(Math.min(Math.abs(array[i] - n), num) == Math.abs(array[i] - n) && Math.abs(array[i] - n) != num) {
                answer = array[i];
                num =Math.abs(array[i] - n);
            }
        }
        return answer;
    }
}