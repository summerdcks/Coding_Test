import java.util.*;
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= included.length; i++) {
            arr.add(a + (i-1)*d);
        }
        for(int i = 0; i < included.length; i++) {
            if(included[i] == true) {
                answer += arr.get(i);
            }
        }
        return answer;
    }
}