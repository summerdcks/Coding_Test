import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        //알파벳별로 클릭횟수 적을때 map에 넣기
        HashMap<Character, Integer> hm = new HashMap<>();
        for(String str : keymap) {
            for(int i = 0 ; i < str.length(); i++) {
                char c= str.charAt(i);
                if(!hm.containsKey(c) || i < hm.get(c)) {
                    hm.put(c, i+1);
                }
            }
        }
        
        //누르기
        for(int i = 0; i < targets.length; i++) {
            int cnt = 0;
            for(int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                if(!hm.containsKey(c)) {
                    cnt = -1;
                    break;
                } else {
                    cnt += hm.get(c);
                }
            }
            answer[i] = cnt;
        }
            
        return answer;
    }
}