import java.util.*;
class Solution {
    public String[] solution(String myString) {
        ArrayList<String> arr = new ArrayList<>();
        String[] answer = myString.split("x");
        for(int i = 0; i<answer.length;i++) {
            if(!answer[i].equals("")) {
                arr.add(answer[i]);
            }
        }
        answer = arr.toArray(new String[arr.size()]);
        Arrays.sort(answer);
        return answer;
    }
}