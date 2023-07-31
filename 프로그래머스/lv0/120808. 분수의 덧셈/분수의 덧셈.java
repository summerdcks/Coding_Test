class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = numer1*denom2 + numer2*denom1;
        int bottom = denom1*denom2;
        int gcd = GCD(top, bottom);
        int[] answer = {top/gcd, bottom/gcd};
        return answer;
    }
    
    int GCD(int a, int b) {
        if(a%b ==0) return b;
        return GCD(b, a%b);
    }
}