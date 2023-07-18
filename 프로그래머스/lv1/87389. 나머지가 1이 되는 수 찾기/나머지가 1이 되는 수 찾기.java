class Solution {
    public int solution(int n) {
        int answer = 0;
        int numb = 1;
        while(true) {
            if (n % numb == 1) {
                answer = numb;
                break;
            }
            numb++;
        }
       
        return answer;
    }
}