import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr11 = new String[n];
        String[] arr22 = new String[n];
        for(int i = 0; i < n; i++) {
            String one = Integer.toBinaryString(arr1[i]);
            String two = Integer.toBinaryString(arr2[i]);
            arr11[i] = "0".repeat(n-one.length()) + one;
            arr22[i] = "0".repeat(n-two.length()) + two;
        }
        for(int i = 0; i < n; i++) {
            char[] c1 = arr11[i].toCharArray();
            char[] c2 = arr22[i].toCharArray();
            char[] c3 = new char[n];
            for(int j = 0; j < n; j++) {
                if(c1[j] == '0' && c2[j] == '0') {
                    c3[j] = ' ';
                } else {
                    c3[j] = '#';
                }
            } 
            answer[i] = new String(c3);  
        }  
        return answer;
    }
}