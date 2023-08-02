import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        int sum = 0;
        for(int i = 0; i < d.length; i ++) {
            sum+=d[i];
        }
        if(sum <= budget) {
            return d.length;
        }
        
        for(int i = 0 ; i < d.length-1; i++) {
            budget = budget - d[i];  
            answer++;          
            if (budget < d[i+1]) {
                break;
            }
        }
        
        return answer;
    }
}