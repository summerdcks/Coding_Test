class Solution {
    public int solution(int num1, int num2) {
        double db = (double)num1 / (double)num2;
        int answer = (int)(db * 1000);
        return answer;
    }
}