import java.util.*;
class Solution {
    public Integer[] solution(String my_string) {
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i = (int)'A'; i <= (int)'Z'; i++) {
            int count = 0;
            for(int j = 0; j < my_string.length(); j++){
                if(my_string.charAt(j) == (char)i) {
                    count++;
                }
            }      
            arr.add(count);         
        }
        
        for(int i = (int)'a'; i <= (int)'z'; i++) {
            int count = 0;
            for(int j = 0; j < my_string.length(); j++){
                if(my_string.charAt(j) == (char)i) {
                    count++;
                }
            }      
            arr.add(count);           
        }
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}