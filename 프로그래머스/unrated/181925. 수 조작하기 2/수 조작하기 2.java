class Solution {
    public String solution(int[] numLog) {
        String result = "";
        for(int i = 0; i < numLog.length-1; i++) {
            if(numLog[i+1] - numLog[i] == 1) {
                result += "w";
            } else if(numLog[i+1] - numLog[i] == -1) {
                result += "s";
            } else if(numLog[i+1] - numLog[i] == 10) {
                result += "d";
            } else if(numLog[i+1] - numLog[i] == -10) {
                result += "a";
            }
        }
        
        return result;
    }
}