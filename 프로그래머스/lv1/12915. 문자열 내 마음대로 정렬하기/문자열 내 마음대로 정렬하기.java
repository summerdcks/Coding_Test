import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        for(int i = 0; i < strings.length-1; i++){
            for(int j = i+1; j < strings.length; j++) {
                if((int)strings[i].charAt(n) > (int)strings[j].charAt(n)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else if((int)strings[i].charAt(n) == (int)strings[j].charAt(n)) {
                    String[] str = new String[2];
                    str[0] = strings[i];
                    str[1] = strings[j];
                    Arrays.sort(str);
                    strings[i] = str[0];
                    strings[j] = str[1];
                }
            }
        }
        return strings;
    }
}