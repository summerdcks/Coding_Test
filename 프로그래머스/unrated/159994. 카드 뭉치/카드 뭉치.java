import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        //세팅
        Queue<String> q1 = new LinkedList<String>();
        Queue<String> q2 = new LinkedList<String>();
        for(int i = 0; i < cards1.length; i++) {
            q1.add(cards1[i]);
        }
        for(int i = 0; i < cards2.length; i++) {
            q2.add(cards2[i]);
        }
        //확인
        for(int i =0; i < goal.length; i++) {
            if(q1.size() > 0 && q1.peek().equals(goal[i])) {
                q1.remove();
            } else if(q2.size() > 0 && q2.peek().equals(goal[i])) {
                q2.remove();
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}