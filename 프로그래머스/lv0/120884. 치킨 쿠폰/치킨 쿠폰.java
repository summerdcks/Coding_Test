class Solution {
    public int solution(int chicken) {
        int answer = 0;
        do {
            answer += chicken/10;
            chicken = chicken/10 + chicken % 10;
        } while(chicken > 9);
        return answer;
    }
}