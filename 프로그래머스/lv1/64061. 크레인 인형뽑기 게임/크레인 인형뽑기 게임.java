import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < moves.length; i++) {
            int temp = 0;
            for(int j = 0; j < board.length; j++) {
                if(board[j][moves[i]-1] != 0) {
                    temp = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
            if(st.size() != 0 && st.peek() == temp && temp != 0) {
                st.pop();
                answer++;
            } else {
                st.add(temp);
            }
        }
        return answer*2;
    }
}