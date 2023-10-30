class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
         boolean a1 = false;
         boolean a2 = false;
        if(x1 == true || x2 == true) {
            a1 = true;
        }
        if(x3 == true || x4 == true) {
            a2 = true;
        }
        if(a1 == true  && a2 == true) {
            answer = true;
        }
        return answer;
    }
}