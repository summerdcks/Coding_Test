class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String atob = String.valueOf(a) + String.valueOf(b);
        String btoa = String.valueOf(b) + String.valueOf(a);
        if(Integer.parseInt(atob) > Integer.parseInt(btoa)) {
            answer = Integer.parseInt(atob);
        } else {
            answer = Integer.parseInt(btoa);
        }
        return answer;
    }
}