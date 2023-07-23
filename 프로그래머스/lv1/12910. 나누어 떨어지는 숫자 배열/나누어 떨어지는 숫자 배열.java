import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
       
        ArrayList<Integer> al = new ArrayList<>();
        for(int number : arr) {
            if(number % divisor == 0) {
                al.add(number);
            }
        }
        int[] answer = new int[al.size()];
        if(al.size() == 0) {
            return new int[] {-1};
        } else {
            for(int i=0; i<al.size(); i++) {
                answer[i] = al.get(i);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
}