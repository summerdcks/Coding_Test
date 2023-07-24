class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int count = 0;
        for(int num:num_list) {
            answer[count] = num;
            count++;
        }
        if(num_list[num_list.length-1] > num_list[num_list.length-2]) {
            answer[num_list.length] = num_list[num_list.length-1] - num_list[num_list.length-2];
        } else {
            answer[num_list.length] =  num_list[num_list.length-1] * 2;
        }
        return answer;
    }
}