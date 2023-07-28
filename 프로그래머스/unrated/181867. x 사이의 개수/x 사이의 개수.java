import java.util.*;
class Solution {
    public Integer[] solution(String myString) {
       
        ArrayList<Integer> arr = new ArrayList<>();
        String[] str = myString.split("x", myString.length());
        for(int i = 0; i < str.length; i++) {
            arr.add(str[i].length());
        }
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}