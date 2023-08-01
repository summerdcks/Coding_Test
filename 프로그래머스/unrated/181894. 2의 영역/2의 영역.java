import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }
        
         for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == 2) {
                end = i;
                break;
            }
        }
        int[] answer = {-1};
        if(start == -1 && end == -1) {
            answer[0] = -1;
        } else if(start != -1 && end != -1) {
            answer = Arrays.copyOfRange(arr, start, end+1);
        }
         return answer;
    }
}