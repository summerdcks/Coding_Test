class Solution {
    public int[] solution(String[] keyinput, int[] board) {
       
        int x = 0;
        int y = 0;
        for(int i =0; i < keyinput.length; i++) {
            if(keyinput[i].equals("right")) x = x+1;
            else if(keyinput[i].equals("left")) x = x-1;
            else if(keyinput[i].equals("up")) y = y+1;
            else if(keyinput[i].equals("down")) y = y-1;
            if(x > board[0]/2) {
                x = board[0]/2;
            }
            else if(x <= -(board[0]/2)) {
                x = -(board[0]/2);
            }
            if(y > board[1]/2) {
                y = board[1]/2;
            }
            else if(y <= -(board[1]/2)) {
                y = -(board[1]/2);
            }
        }
         int[] answer = {x,y};
        return answer;
    }
}