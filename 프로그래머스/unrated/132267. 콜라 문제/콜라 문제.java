class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        do {
            int plus = b * (n/a);
            answer+= plus;
            n = n % a + plus;
        } while(n >= a);
        return answer;
    }
}