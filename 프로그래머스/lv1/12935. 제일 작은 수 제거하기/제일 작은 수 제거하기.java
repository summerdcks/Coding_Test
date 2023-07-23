import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> al = new ArrayList<>();
        int min = 9999;
        for(int number : arr) {
             if(number < min) {
                min = number;
             }
        }
        for(int numb : arr) {
            if(numb == min) {
                
            }
            if(numb != min) {
                al.add(numb);
            }          
        }
        if(al.size() == 0) {
            return new int[] {-1};
        } else {
            int[] answer = new int[al.size()];
            for(int i=0; i < al.size(); i++) {
                answer[i] = al.get(i);
            }
            return answer;
        }
       
    }
}