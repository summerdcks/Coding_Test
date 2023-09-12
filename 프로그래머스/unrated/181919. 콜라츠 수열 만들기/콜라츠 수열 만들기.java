import java.util.*;

class Solution {
    public Integer[] solution(int n) {   
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);
        while(n != 1) {
            int ret = calculate(n);
            arr.add(ret);
            n = ret;
        }
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
   
    public int calculate(int n) {
        int ret = 0;
        if(n % 2 == 0) { //짝수
            ret = n / 2;
        } else { //홀수
            ret = 3 * n + 1;
        }
        return ret;
    }
}