import java.util.*;
class Solution {
    public Integer[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = n; i < num_list.length; i++) {
            arr.add(num_list[i]);
        }
        
        for(int i = 0; i < n; i++) {
            arr.add(num_list[i]);
        }
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}