class Solution {
    public int solution(int n) {
        int answer = 0;
        while(true) {
            answer++;
            if(fac(answer) > n) {
                break;
            }
        }
        return answer-1;
    }
    
    public int fac(int num) {
        if(num == 1) {
            return 1;
        }
        return num * fac(num-1);
    }
}