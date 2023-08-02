class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        for(int i =0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                count++;
                if(count % 2 == 0) {
                    answer += String.valueOf(s.charAt(i)).toLowerCase();
                
                } else if(count % 2 != 0) {
                    answer += String.valueOf(s.charAt(i)).toUpperCase();

                }
                
            } else {
                answer += " ";
                count = 0;
            }
           
        }
        return answer;
    }
}