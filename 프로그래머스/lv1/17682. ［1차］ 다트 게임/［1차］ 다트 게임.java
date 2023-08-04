class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        for(int i = 0; i < dartResult.length()-1; i++) {
            
            char c1 = dartResult.charAt(i); //현재글자
            char c2 = dartResult.charAt(i+1); //다음글자
            if((int)c1 >= (int)'0' && (int)c1 <= '9' && (int)c2 != '0') { 
                //현재글자가 숫자고 다음글자가 영어일때
                int score = 0;
                if(c2 == 'S') {
                    score += Character.getNumericValue(c1);
                } else if(c2 == 'D'){
                    score += Character.getNumericValue(c1) * Character.getNumericValue(c1);
                } else if(c2 == 'T') {
                    score += Character.getNumericValue(c1) * Character.getNumericValue(c1)
                        * Character.getNumericValue(c1);
                }
                
                
                
            } else if (c1 == '1' && c2 == '0') { //10점일때
                
            }
        }
        return answer;
    }
}