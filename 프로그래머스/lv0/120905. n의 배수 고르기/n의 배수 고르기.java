import java.util.*;
class Solution {
    public Integer[] solution(int n, int[] numlist) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int num : numlist) {
            if(num % n == 0) {
                arr.add(num);
            }
        }
        Integer [] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}