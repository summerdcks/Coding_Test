import java.util.*;
class Solution {
    public Integer[] solution(int num, int total) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = total;
        while(true) {
            int sum = 0;            
            for(int j = i; j < i+num; j++) {
                sum += j;
                arr.add(j);
            }
            if(sum == total) break;
            arr.clear();
            i--;
        }
    
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}