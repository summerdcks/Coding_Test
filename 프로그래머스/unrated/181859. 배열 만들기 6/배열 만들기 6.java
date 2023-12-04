import java.util.*;
class Solution {
    public Integer[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(stk.size() == 0) {
                stk.add(arr[i]);
            } else if(stk.get(stk.size()-1) == arr[i]) {
                stk.remove(stk.size()-1);
            } else {
                stk.add(arr[i]);
            }
        }
        if(stk.size() == 0) stk.add(-1);
        Integer[] answer = stk.toArray(new Integer[stk.size()]);
        return answer;
    }
}