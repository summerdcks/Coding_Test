class Solution {
    public int solution(int balls, int share) {
        double answer = fac(balls)/(fac(share)*fac(balls-share));
        return (int)Math.round(answer);
    }
    
    public double fac(int num) {
        if(num <= 1) return 1;
        return num*fac(num-1);
    }
}