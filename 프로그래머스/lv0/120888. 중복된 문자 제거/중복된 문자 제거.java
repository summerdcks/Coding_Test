import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < my_string.length(); i++) {
            if(hm.get(my_string.substring(i, i+1)) == null) {
                answer+= my_string.substring(i, i+1);
                hm.put(my_string.substring(i, i+1), 1);
            }
        }
        return answer;
    }
}