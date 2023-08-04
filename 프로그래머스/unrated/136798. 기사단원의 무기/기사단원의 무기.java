class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int temp = count(i);
            if(temp > limit) temp = power;
            answer += temp;
        }        
        return answer;
    }
    
    //약수갯수 구하기
    public int count(int n) { 
        int ret = 0;
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                ret++;
                if(n / i != i) {
                    ret++;
                }
            }
        }
        return ret;
    }
}