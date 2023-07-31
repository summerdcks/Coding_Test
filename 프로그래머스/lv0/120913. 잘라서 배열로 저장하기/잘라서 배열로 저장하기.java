import java.util.*;
class Solution {
    public String[] solution(String my_str, int n) {
        
        String str = "";
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < my_str.length(); i++) {
            str += my_str.substring(i,i+1);
            if((i+1) % n ==0) {
                arr.add(str);
                str ="";
            } else if((i+1) == my_str.length()) {
                arr.add(str);
            }
        }
        String[] answer = arr.toArray(new String[arr.size()]);
        return answer;
    }
}