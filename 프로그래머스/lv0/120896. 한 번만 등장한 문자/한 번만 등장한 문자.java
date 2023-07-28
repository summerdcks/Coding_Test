import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i) , 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(hm.get(s.charAt(i)) == 1) {
                answer += s.charAt(i);
            }
        }
        char[] c = answer.toCharArray();
        Arrays.sort(c);
        answer = "";
        for(char ch : c) {
            answer+= ch;
        }               
        return answer;
    }
}