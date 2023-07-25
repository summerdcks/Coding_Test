import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int num : arr) {
            for(int i = 0; i < num; i++) {
                array.add(num);
            }    
        }
        int[] answer = new int[array.size()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}