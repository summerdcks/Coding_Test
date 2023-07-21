class Solution {
    public int solution(int n) {
        long num = (long) n;
        int answer = 0;
        if(num == 1) {
            answer = 0;
        } else{
            while(true){
                if(answer > 500) {
                    answer = -1;
                    break;
                }
                if(num % 2 == 0) {
                    num = num /2;
                    answer++;
                }
                if(num % 2 != 0 && num != 1) {
                    num = num * 3 + 1;
                    answer++;
                }
                if(num == 1) {
                    break;
                }
                
            }
        }
        return answer;
    }
}