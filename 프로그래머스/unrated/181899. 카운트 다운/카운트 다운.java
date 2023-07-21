import java.util.*;
class Solution {
    public Integer[] solution(int start, int end) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = start; i >= end; i--) {
            arr.add(i);
        }
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}