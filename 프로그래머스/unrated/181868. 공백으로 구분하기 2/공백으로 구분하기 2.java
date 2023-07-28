import java.util.*;
class Solution {
    public String[] solution(String my_string) {   
        ArrayList<String> arr = new ArrayList<>();
        String[] ms = my_string.split(" ");
        for(String word : ms) {
            if(!word.equals("")){
                arr.add(word);
            }
        }
        String[] answer = arr.toArray(new String[arr.size()]);
        return answer;
    }
}