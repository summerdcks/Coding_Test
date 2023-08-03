import java.util.*;
class Solution {
    public Integer[] solution(int[] answers) {

        int[] one = new int[answers.length];
        int[] two = new int[answers.length];
        int[] three = new int[answers.length];
        
        for(int i = 0; i < answers.length; i++) {
            one[i] = i % 5 + 1;
            
            if(i % 2 == 0) {
                two[i] = 2;
            } else if (i % 8 == 1) {
                 two[i] = 1;
            }else if (i % 8 == 3) {
                 two[i] = 3;
            }else if (i % 8 == 5) {
                 two[i] = 4;
            }else if (i % 8 == 7) {
                 two[i] = 5;
            }
            
            if(i % 10 == 0 || i % 10 == 1) {
                three[i] = 3;
            } else if(i % 10 == 2 || i % 10 == 3) {
                three[i] = 1;
            } else if(i % 10 == 4 || i % 10 == 5) {
                three[i] = 2;
            } else if(i % 10 == 6 || i % 10 == 7) {
                three[i] = 4;
            } else if(i % 10 == 8 || i % 10 == 9) {
                three[i] = 5;
            }
        }
        
        int on = 0;
        int tw = 0;
        int th = 0;
        for(int i = 0; i < answers.length; i++) {
            if(one[i] == answers[i]) on++;
            if(two[i] == answers[i]) tw++;
            if(three[i] == answers[i]) th++;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        int ret = Math.max(Math.max(on, tw), th);
        if(ret == on) arr.add(1);
        if(ret == tw) arr.add(2);
        if(ret == th) arr.add(3);
        Integer[]answer= arr.toArray(new Integer[arr.size()]);
        Arrays.sort(answer);
        
        return answer;
    }
}