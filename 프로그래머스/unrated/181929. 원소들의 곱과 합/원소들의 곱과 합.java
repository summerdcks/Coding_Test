class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum = 0;
        for(int num : num_list) {
            sum+=num;
            multi*=num;
        }
        if(multi < sum*sum) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}