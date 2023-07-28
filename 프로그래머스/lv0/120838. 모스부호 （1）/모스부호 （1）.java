class Solution {
    public String solution(String letter) {
         String answer = "";
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] str = letter.split(" ");
        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < alphabet.length; j++) {
                if(str[i].equals(morse[j])) {
                    answer += alphabet[j];
                }
            }
        }                
        return answer;
    }
}