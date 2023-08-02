import java.util.*;
class Solution {
    public String[] solution(String myStr) {     
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        myStr = myStr.replaceAll("a", " ").replaceAll("b", " ").replaceAll("c", " ");
        String[] str = myStr.split(" ");       
        for(int i = 0; i < str.length; i++) {  
            if(!str[i].equals("")){
                arr.add(str[i]);        
            }
        }
        if(arr.size() == 0) {
            answer = new String[1];
            answer[0] = "EMPTY";
        } else {
            answer = arr.toArray(new String[arr.size()]);
        }
        return answer;
    }
}