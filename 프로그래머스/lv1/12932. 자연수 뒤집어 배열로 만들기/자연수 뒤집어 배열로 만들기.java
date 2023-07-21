import java.util.*;
class Solution {
    public Integer[] solution(long n) {
        String number = Long.toString(n);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = number.length() -1; i >= 0; i--) {
            arr.add(Character.getNumericValue(number.charAt(i)));
        }
        Integer[] answer = arr.toArray(new Integer[0]);
        return answer;
    }
}