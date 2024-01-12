class Solution {
    public String solution(String new_id) {
        String answer = "";
        //1
        new_id = new_id.toLowerCase();
        //2
        for(int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if(!((int)c >= (int)'a' && (int)c <= (int)'z') &&
              !((int)c >= (int)'0' && (int)c <= (int)'9') &&
              c != '-' && c != '_' && c != '.') {
                
            } else {
                answer += c;
            }
        }
        //3
        do{
            answer = answer.replace("..", ".");
        }while(answer.contains(".."));       
        //4
        if(answer.charAt(0) == '.') {
            answer = answer.substring(1,answer.length());
        }
        if(answer.length() >= 1 && answer.charAt(answer.length()-1) == '.') {
            answer = answer.substring(0,answer.length()-1);
        }
        //5
        if(answer.equals("")) {
            answer = "a";
        }
        //6
        if(answer.length() >= 16) {
            answer = answer.substring(0,15);
        }
        if(answer.charAt(answer.length()-1) == '.') {
            answer = answer.substring(0,answer.length()-1);
        }
        //7
        if(answer.length() <= 2) {
            answer = answer + answer.charAt(answer.length()-1) + answer.charAt(answer.length()-1) + answer.charAt(answer.length()-1);
            answer = answer.substring(0,3);
        }
        return answer;
    }
}