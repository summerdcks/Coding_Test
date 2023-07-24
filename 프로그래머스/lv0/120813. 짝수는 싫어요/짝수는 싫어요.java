import java.util.*;
class Solution {
    public Integer[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0 ; i <= n ; i++) {
            if(i % 2 != 0) {
                arr.add(i);
            }
        }
        Integer[] answer = arr.toArray(new Integer [arr.size()]);
        return answer;
    }
}