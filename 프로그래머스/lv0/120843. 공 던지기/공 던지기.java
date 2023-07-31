class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        if((1 + 2*(k-1)) % numbers.length -1 != -1) {
            answer = numbers[(1 + 2*(k-1)) % numbers.length -1];
        } else {
            answer = numbers[numbers.length-1];
        }
        return answer;
    }
}