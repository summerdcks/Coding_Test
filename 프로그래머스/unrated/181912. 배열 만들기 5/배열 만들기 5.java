import java.util.*;
class Solution {
    public Integer[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(String str : intStrs) {
            int temp = Integer.parseInt(str.substring(s, s+l));
            if(temp > k) {
                arr.add(temp);
            }
        }
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}