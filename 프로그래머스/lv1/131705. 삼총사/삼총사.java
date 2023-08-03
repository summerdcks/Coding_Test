class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0 ; i < number.length; i++) {
            for(int j = i+1; j < number.length; j++) {
                for(int h = j+1; h< number.length; h++) {
                    if(number[i] + number[j] + number[h] == 0) { 
                       answer++;
                    }
                }
            }
        }
        return answer;
    }
}