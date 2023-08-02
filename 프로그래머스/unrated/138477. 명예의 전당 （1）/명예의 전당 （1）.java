import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int [score.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            arr.add(score[i]);
            Integer[] ret = arr.toArray(new Integer[arr.size()]);
            Arrays.sort(ret);
            if(ret.length < k) {
                answer[i] = ret[0];
            } else {
                answer[i] = ret[arr.size()-k];
            }
        }
        return answer;
    }
}