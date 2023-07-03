import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i < completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            } else {
                answer = participant[completion.length];
            }
       
        }
        if(completion.length == 0) {
            answer = participant[0];
        }
        return answer;
    }
}