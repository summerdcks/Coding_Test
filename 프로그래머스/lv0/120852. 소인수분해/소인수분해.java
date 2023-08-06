import java.util.*;
class Solution {
    public Integer[] solution(int n) {
       
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                arr.add(i);
                while(n % i == 0) {
                    n = n / i;
                }
            }
        }
         Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}