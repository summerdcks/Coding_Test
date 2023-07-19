import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {  
        Set<Integer> hs = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i+1; j < numbers.length; j++) {                
                hs.add(numbers[i] + numbers[j]);                
            }
        }
        int[] answer = new int[hs.size()];
        int count = 0;
        for(int number : hs) {
            answer[count] = number;
            count++;
        }
        Arrays.sort(answer);
        return answer;
    }
}