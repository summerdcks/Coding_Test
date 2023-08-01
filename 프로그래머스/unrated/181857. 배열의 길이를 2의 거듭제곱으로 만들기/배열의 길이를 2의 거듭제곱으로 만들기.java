import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int number = 1;
        int count = 0;
        while(true) {
            if(number >= arr.length) break;
            number = number * 2;
            count++;
        }
        int[] answer = new int [number];
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}