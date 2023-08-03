class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] xx = new int [10];
        int[] yy = new int [10];
        
        for(int i = 0; i < X.length(); i++) {
            xx[Character.getNumericValue(X.charAt(i))] ++;
        }
        for(int i = 0; i < Y.length(); i++) {
            yy[Character.getNumericValue(Y.charAt(i))] ++;
        }
        
        for(int i = 9 ; i >= 0; i--) {
            if(xx[i] != 0 && yy[i] != 0) {
                int count = Math.min(xx[i], yy[i]);
                answer += String.valueOf(i).repeat(count); 
            }
        }
        if(answer.startsWith("0") == true) {
            return "0";
        }
        if(answer.equals("")) {
            answer = "-1";
        }
        return answer;
    }
}