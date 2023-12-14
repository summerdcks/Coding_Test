import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        //신고 중복제거
        HashSet<String> hs = new HashSet<>(); //중복제거한 report
        for(String st : report) {
            hs.add(st);
        } 
        //신고당한 횟수
        HashMap<String, Integer> hp = new HashMap<>(); //신고당한사람과 횟수
        Iterator<String> it = hs.iterator();
        while(it.hasNext()) {
            String[] st = ((String)it.next()).split(" ");
            hp.put(st[1], hp.getOrDefault(st[1], 0) + 1);
        }

        //신고횟수 k 넘음
        ArrayList<String> aL = new ArrayList<>(); //정지대상 리스트
        for(Map.Entry<String, Integer> entry : hp.entrySet()) {
            if(entry.getValue() >= k) {
                aL.add(entry.getKey());
            }
        }
        //이메일
        HashMap<String, Integer> hm = new HashMap<>(); //신고자와 받을메일수      
        Iterator<String> it2 = hs.iterator();
        while(it2.hasNext()) { //중복제거한 report돌면서 정지대상자에 해당하면 이메일+1
            String[] st = ((String)it2.next()).split(" ");
            for(int i = 0 ; i < aL.size(); i++) {
                if(st[1].equals(aL.get(i))){
                    hm.put(st[0], hm.getOrDefault(st[0], 0) + 1);
                }
            }
        }  
        //int array에 담기
        int[] answer = new int[id_list.length];
        for(int i = 0; i < answer.length; i++) {
            if(hm.get(id_list[i]) != null) {
                answer[i] = hm.get(id_list[i]);
            }
        }
        return answer;
    }
}