import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= rank.length; i++) {
            for(int j = 0; j < rank.length; j++) {
                if((rank[j] == i) && (attendance[j] == true)) {
                    arr.add(j);
                }
            }
        }
        int answer = arr.get(0) * 10000 
                    + arr.get(1) * 100
                    + arr.get(2);
        return answer;
    }
}