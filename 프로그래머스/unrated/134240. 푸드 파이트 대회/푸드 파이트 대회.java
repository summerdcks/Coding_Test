class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 0; i < food.length; i++) {
            int count = food[i] /2;
            answer += String.valueOf(i).repeat(count);
        }
       
        StringBuilder sb = new StringBuilder(answer);
        sb.reverse();
        answer = answer+ "0" + sb.toString();
        return answer;
    }
}