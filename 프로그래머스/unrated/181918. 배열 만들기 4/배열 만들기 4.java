import java.util.*;
class Solution {
    public Integer[] solution(int[] arr) {
        
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        do {
            if(stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else{ //size > 0
                if(stk.get(stk.size()-1) < arr[i]) {
                    stk.add(arr[i]);
                    i++;
                } else {
                    stk.pop();
                }                               
            }
        } while(i < arr.length);
        Integer[] ret = new Integer[stk.size()];
        for(int j = 0; j < stk.size(); j++) {
            ret[j] = stk.elementAt(j);
        }
        return ret;
    }
}