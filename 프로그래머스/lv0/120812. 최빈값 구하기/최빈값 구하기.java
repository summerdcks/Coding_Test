import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        //해시맵
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            hm.put(array[i], hm.getOrDefault(array[i], 0) + 1);
        }
        
        //최빈값
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if(entry.getValue() > max) {
                max = entry.getValue();
                answer = entry.getKey();
            } 
        }
        
        //예외처리
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() == max) {
                count++;
            }
        }
        if(count != 1) answer = -1;
        return answer;
    }
}