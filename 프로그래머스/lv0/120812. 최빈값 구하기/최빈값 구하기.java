import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        //해시맵
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            hm.put(array[i], hm.getOrDefault(array[i], 0) + 1);
        }
        //최댓값
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue());
            if(entry.getValue() > max) {
                max = entry.getValue();
                answer = entry.getKey();
            } else if (entry.getValue() == max) {
                answer = -1;
            }
        }
        return answer;
    }
}