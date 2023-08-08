class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0; i < num_list.length; i++) {
            while(true) {
                if(num_list[i] % 2 == 0) { //짝수
                    num_list[i] = num_list[i] / 2;
                    answer++;
                }
                if(num_list[i] % 2 != 0 && num_list[i] != 1) { //홀수
                    num_list[i] = (num_list[i] - 1) / 2;
                    answer++;
                }
                if(num_list[i] == 1) {
                    break;
                }
            }
        }
        return answer;
    }
}