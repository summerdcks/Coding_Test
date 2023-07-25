class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int jjack = 0;
        int hol = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 == 0) { //홀수
                hol += num_list[i];
            } else { //짝수
                jjack += num_list[i];
            }
        }
        answer = Math.max(hol, jjack);
        return answer;
    }
}