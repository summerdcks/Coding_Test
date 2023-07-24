import java.util.*;
class Solution {
    public Integer[] solution(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) {
                arr.add(i);
            }
        }
        Integer[] answer = arr.toArray(new Integer [arr.size()]);
        Arrays.sort(answer);
        return answer;
    }
}