class Solution {
    public int solution(String my_string) {
        
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        for(int i =1; i < str.length; i++) {
            if(str[i-1].equals("+")) {
                answer += Integer.parseInt(str[i]);
            } else if(str[i-1].equals("-")) {
                answer -= Integer.parseInt(str[i]);
            } 
        }
        return answer;
    }
}