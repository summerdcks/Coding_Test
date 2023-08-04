import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {    
        //스테이지에 머무는 인원수
        double[] players = new double[N+1];
        for(int i = 0; i < stages.length; i++) {
            players[stages[i]-1]++;
        }
        //실패율
        double[] rate = new double[N];
        double total = stages.length;
        for(int i = 0; i < rate.length; i++) {
            if(total != 0 && players[i] != 0) {
                rate[i] = players[i]/total;
            } else {
                rate[i] = 0;
            }
            total = total - players[i];
        }        
        //랭크
        int[] answer = new int[N];
        double maxValue = -1.0;
        int maxIndex = -1;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(maxValue < rate[j]) {
                    maxIndex = j;
                    maxValue = rate[j];
                }
            }
            answer[i] = maxIndex + 1;
            rate[maxIndex] = -1;  
            maxValue = -1;
        }

        return answer;
    }
}