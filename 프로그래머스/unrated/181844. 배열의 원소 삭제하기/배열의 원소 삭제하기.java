import java.util.*;
class Solution {
    public Integer[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> aL = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    count++;
                }
            }
            if(count == 0) {
                aL.add(arr[i]);
            }
        }
        Integer[] answer = aL.toArray(new Integer[aL.size()]);
        return answer;
    }
}