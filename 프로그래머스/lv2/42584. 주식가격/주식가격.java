import java.util.*;
class Solution {
    public Integer[] solution(int[] prices) {      
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < prices.length; i++) {
            int count = 0;
            if(i == prices.length) {
                arr.add(count);
                break;
            } else {
                for(int j = i+1; j < prices.length; j++) {
                    if(prices[i] <= prices[j]) {
                        count++;
                    } else {
                        count++;
                        break;
                    }
                }  
                arr.add(count);
            }
        } 
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}