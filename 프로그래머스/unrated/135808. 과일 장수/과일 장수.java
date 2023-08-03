import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        while(true) {
            arr.add(score[score.length-1-i]);
            i++;
            if(i % m == 0) {
                Collections.sort(arr);
                answer += m * arr.get(0);
                arr.clear();
            }
            if(i == score.length) break;
        }
        return answer;
    }
}