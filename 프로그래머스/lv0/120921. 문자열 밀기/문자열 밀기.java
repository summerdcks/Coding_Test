class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        for(int i = 0; i < A.length(); i++) {
            if(A.equals(B)) {
                answer = i;
                break;
            }
            A = A.substring(A.length()-1, A.length()) + A.substring(0,A.length()-1);
        }
        return answer;
    }
}