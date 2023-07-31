class Solution {
    public long solution(int balls, int share) {
        double answer = fac(balls)/(fac(share)*fac(balls-share));
        return Math.round(answer);
    }
    
    public double fac(int x) {
        if (x < 1) return 1;
        if (x == 1) return 1;
        return x *fac(x-1);
    }
}