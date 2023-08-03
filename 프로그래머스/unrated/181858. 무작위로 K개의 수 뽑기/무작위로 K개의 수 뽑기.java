import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer>al = new ArrayList<>();
        int[] answer = new int[k];
        for(int i =0; i < k; i++) {
            answer[i] = -1;
        }
        al.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(!al.contains(arr[i])) {
                al.add(arr[i]);
            }
        }
        for(int i =0; i < Math.min(k, al.size()); i++) {
            answer[i] = al.get(i);
        }
        return answer;
    }
}