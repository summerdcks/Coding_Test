class Solution {
    public int solution(String s) {
        int answer = 0;
        int countC = 0;
        int countElse = 0;
        char c = s.charAt(0);
        for(int i = 0; i < s.length()-1; i++) {
            
            if(s.charAt(i) == c) {
                countC++;
            } else {
                countElse++;
            }
            if(countC == countElse) {
                countC = 0;
                countElse = 0;
                c = s.charAt(i+1);
                answer++;
            }
        }
        return answer+1;
    }
}