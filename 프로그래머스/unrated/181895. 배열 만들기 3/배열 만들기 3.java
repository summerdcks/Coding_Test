import java.util.*;
class Solution {
    public Integer[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            al.add(arr[i]);
        } 
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            al.add(arr[i]);
        }
        Integer [] answer = al.toArray(new Integer[al.size()]);
        return answer;
    }
}