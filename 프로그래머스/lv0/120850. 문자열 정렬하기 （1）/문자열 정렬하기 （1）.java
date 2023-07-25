import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++) {
            if((int)my_string.charAt(i) >= (int)'0' && (int)my_string.charAt(i) <= (int)'9') {
                arr.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}