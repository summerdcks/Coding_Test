class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int countZero = 0;
        for(int i = 0; i < lottos.length; i++) {
            for(int j = 0; j < win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    count++;
                }
            }
            if(lottos[i] == 0) {
                countZero++;
            }
        }       
        int sum = count + countZero;
        if(sum == 6) answer[0] = 1;
        else if(sum == 5) answer[0] = 2;
        else if(sum == 4) answer[0] = 3;
        else if(sum == 3) answer[0] = 4;
        else if(sum == 2) answer[0] = 5;
        else answer[0] = 6;
        
        if(count == 6) answer[1] = 1;
        else if(count == 5) answer[1] = 2;
        else if(count == 4) answer[1] = 3;
        else if(count == 3) answer[1] = 4;
        else if(count == 2) answer[1] = 5;
        else answer[1] = 6;
       
        return answer;
    }
}