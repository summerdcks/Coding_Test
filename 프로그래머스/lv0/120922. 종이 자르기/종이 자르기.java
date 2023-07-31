class Solution {
    public int solution(int M, int N) {
        int min = Math.min(M,N);
        int max = Math.max(M,N);
        int answer = (min-1)+(max-1)*min;
        return answer;
    }
}