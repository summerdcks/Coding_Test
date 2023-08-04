class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] prime = new int[n+1];
        
        for(int i = 0; i < prime.length; i++) {
            prime[i] = i;
        }
        
        prime[1] = 0;
        
        for(int i = 2;  i * i < prime.length; i++) {
            if(prime[i] != 0) {
                for(int j = i * i; j <= n; j += i) {
                    prime[j] = 0;
                }
            }
        }
        
        for(int i = 0; i < prime.length; i++) {
            if(prime[i] != 0) answer++;
        }
        return answer;
    }
}