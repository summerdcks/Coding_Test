class Solution {
    public int[] solution(int[] num_list) {        
        int a = 0;
        int b = 0;
        for(int number : num_list){
            if(number % 2 == 0) {
                a++;
            }
            if(number % 2 != 0) {
                b++;
            }
        }
        int[] answer = {a, b};
        return answer;
    }
}