class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double a = ((double)(dots[0][0] - dots[1][0])/(dots[0][1]-dots[1][1]));
        double b = ((double)(dots[2][0] - dots[3][0])/(dots[2][1]-dots[3][1]));
        if(a == b) {
            answer = 1;
        }
        double c = ((double)(dots[0][0] - dots[2][0])/(dots[0][1]-dots[2][1]));
        double d = ((double)(dots[1][0] - dots[3][0])/(dots[1][1]-dots[3][1]));
        if(c == d) {
            answer = 1;
        }
        double e = ((double)(dots[0][0] - dots[3][0])/(dots[0][1]-dots[3][1]));
        double f = ((double)(dots[1][0] - dots[2][0])/(dots[1][1]-dots[2][1]));
        if(e == f) {
            answer = 1;
        }
        return answer;
    }
}