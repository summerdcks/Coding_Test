class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        for(int i = 1; i < 31; i++){
            int count = 0;
            for(int j = 0; j < strArr.length; j++) {
                if(strArr[j].length() == i){
                    count++;
                }
            }
            answer = Math.max(count, answer);
        }
        return answer;
    }
}