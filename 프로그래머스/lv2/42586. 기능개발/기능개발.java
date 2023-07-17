import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int a = 0; a < progresses.length; a++) {
            q1.add(progresses[a]);
        }
        for(int b = 0; b < progresses.length; b++) {
            q2.add(speeds[b]);
        }
        ArrayList<Integer> result = new ArrayList<>();
        int count= 0;    
        while(!q1.isEmpty()) {  
            int temp=0;
            count++;
            if(q1.peek() + count * q2.peek() >= 100) {
                q1.poll();
                q2.poll();
                temp++;
                while(!q1.isEmpty()) {
                    if(q1.peek() + count * q2.peek() >= 100) {
                    q1.poll();
                    q2.poll();
                    temp++;
                    } else {
                        result.add(temp);
                        break;
                    }
                }
            }
            if(q1.isEmpty()) {
                result.add(temp);
                break;
            }
        }
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
      
        return answer;
    }
}