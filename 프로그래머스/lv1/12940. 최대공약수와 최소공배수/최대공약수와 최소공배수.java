class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m), lcm(n,m)};
        return answer;
    }
    
    //최대공약수
    public int gcd(int a, int b) {
        if(a%b==0) return b;
        return gcd(b, a%b);
    }
    //최소공배수
    public int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }
}