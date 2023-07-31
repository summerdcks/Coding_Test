import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        for(int i =0; i < dic.length; i++) {
            String[] str = dic[i].split("");
            Arrays.sort(str);
            if(Arrays.toString(spell).equals(Arrays.toString(str))) {
                answer = 1;
            }            
        }
        return answer;
    }
}