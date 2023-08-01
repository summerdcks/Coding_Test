class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder str1 = new StringBuilder();
        str1.append(my_string.substring(0,s));
        
        StringBuilder str2 = new StringBuilder(my_string.substring(s,e+1));
        String reverse = str2.reverse().toString();
        str1.append(reverse);
        
        str1.append(my_string.substring(e+1, my_string.length()));
        
        answer= str1.toString();
        return answer;
    }
}