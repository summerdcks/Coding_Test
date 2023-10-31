class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String str : order) {
            if(str.contains("americano") || str.contains("anything")) {
                answer += 4500;
            }
            if(str.contains("latte")) {
                answer += 5000;
            }
        }
        return answer;
    }
}