class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i = 0 ; i < sizes.length; i++) {
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            max1 = Math.max(max1, max);
            max2 = Math.max(max2, min);
        }
        answer = max1 * max2;
        return answer;
    }
}