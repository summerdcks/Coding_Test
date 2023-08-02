import java.util.*;
class Solution {
    public Integer[] solution(int l, int r) {     
       
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            if(String.valueOf(i).replace("5","").replace("0","").equals("")) {
                arr.add(i);
            }
        }        
        if(arr.size() == 0) {
            arr.add(-1);
        }
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
 
        return answer;
    }
}