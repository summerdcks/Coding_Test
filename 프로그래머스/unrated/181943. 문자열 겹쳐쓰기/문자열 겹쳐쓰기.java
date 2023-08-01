class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        StringBuilder str = new StringBuilder();
        str.append(my_string.substring(0,s)).append(overwrite_string).append(my_string.substring(s+overwrite_string.length(), my_string.length()));
        answer = str.toString();
        return answer;
    }
}