class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for(int i =0 ; i < picture.length; i++) {
            String str = "";
            for(int j = 0; j < picture[i].length(); j++){
                for(int a = 0; a <k; a++) {
                    str = str + picture[i].charAt(j);
                }
            }
            System.out.println(str);
            for(int h = 0; h < k; h++) {
                answer[i*k+h] = str;
            }
          
        }
        return answer;
    }
}