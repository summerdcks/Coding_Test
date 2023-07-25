import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i < num_list.length; i = i+n) {
            arr.add(num_list[i]);
        }
        int[] answer = new int[arr.size()];
        for(int i = 0 ; i < arr.size(); i ++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}