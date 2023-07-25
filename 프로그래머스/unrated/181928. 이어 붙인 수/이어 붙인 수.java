class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String hol = "";
        String jjak = "";
        for(int num : num_list) {
            if(num % 2 == 0) {
                jjak += num;
            } else {
                hol += num;
            }
        }
        answer = Integer.parseInt(jjak) + Integer.parseInt(hol);
        return answer;
    }
}