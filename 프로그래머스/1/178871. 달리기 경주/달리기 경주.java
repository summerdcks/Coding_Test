import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {       
        //해시맵에 등수세팅
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i =0; i < players.length; i++) {
            hm.put(players[i], i);
        }
        for(int i = 0; i < callings.length; i++){
            int me = hm.get(callings[i]);
            int you = hm.get(callings[i])-1;
            
            hm.put(players[you], me);
            hm.put(callings[i], you);
            
            String temp = players[me];
            players[me] = players[you];
            players[you] = temp;
        }    
        return players;
    }
}