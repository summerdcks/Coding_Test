import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                st.push('(');
            } else if (s.charAt(i) == ')') {
                if(st.isEmpty()){
                    answer = false;
                    break;
                }
                st.pop();
            }
            
        }
        if(!st.isEmpty()) {
            answer = false;
        }
//         char[] ss = s.toCharArray();
//         for(int i = 0 ; i < s.length(); i++) {
//             st.push(ss[i]);
//         }
//         if(st.peek() == '(') {
//             st.pop();
//             answer = false;
//         } else {
//             st.pop();
//             int temp = -1;
//             while(!st.isEmpty()) {
//                 if(st.peek() =='(') {
//                     st.pop();
//                     temp++;
//                 } else if (st.peek() == ')') {
//                     st.pop();
//                     temp--;
//                 }
//                 if(temp > 0) {
//                     answer = false;
//                     break;
//                 }
//             }
//             if(temp != 0) {
//                 answer = false;
//             }
        
//         }
        
        return answer;
    }
}