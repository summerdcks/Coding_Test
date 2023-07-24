class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0 ; i < my_string.length(); i++) {
            if((int)my_string.charAt(i) >= (int)'0' && (int)my_string.charAt(i) <= (int)'9' ) {
                answer += Character.getNumericValue(my_string.charAt(i));
            }
        }
        return answer;
    }
}