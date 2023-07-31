import java.util.*;
class Solution {
    public Integer[] solution(int n) {       
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1;i<=n;i++) {
            if(n%i==0) {
                arr.add(i);
            }
        }
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}