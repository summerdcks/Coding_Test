import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int max = citations[citations.length-1];
        for(int i = max; i >= 0; i--){
            int count = 0;
            for(int j = 0; j < citations.length; j++) {
                if(citations[j] >= i) {
                    count++;
                }   
            }
            if(count >= i) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}