import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].contains("l")) {
                for(int j = 0; j < i; j++) {
                    arr.add(str_list[j]);
                }
                break;
            }
            if(str_list[i].contains("r")) {
                for(int j = i+1; j < str_list.length; j++) {
                    arr.add(str_list[j]);
                }
                break;
            }
        }
        String[] answer = arr.toArray(new String[arr.size()]);
        return answer;
    }
}