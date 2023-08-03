class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int g = gcd(a,b);
        b = b/g;
        while(true) {
            if(b % 2 == 0) {
                b /= 2;
            } else if(b % 5 == 0) {
                b /= 5;
            } else if(b == 1) {
                answer = 1;  
                break;
            } else {
                answer = 2;
                break;
            }
        }        
        return answer;
    }
    
    public int gcd(int a, int b) { //최대공약수
        if(a % b == 0) return b;
        return gcd(b, a%b);
    }
}