import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            String word ="";
            for(int j = i; j < my_string.length(); j++) {
                word += my_string.charAt(j);
            }
            arr.add(word);            
        }
        String[] answer = arr.toArray(new String[arr.size()]);
        Arrays.sort(answer);
        return answer;
    }
}