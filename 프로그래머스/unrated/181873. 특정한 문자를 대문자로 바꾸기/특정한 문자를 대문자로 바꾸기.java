class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0 ; i < my_string.length(); i++) {           
            if(String.valueOf(my_string.charAt(i)).equals(alp)) {
               String c = String.valueOf(my_string.charAt(i)).toUpperCase();
                answer += c;
            } else {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}