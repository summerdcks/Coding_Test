class Solution {
    public int solution(int a, int b) {
        int atob = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        return Math.max(atob, 2*a*b);
    }
}