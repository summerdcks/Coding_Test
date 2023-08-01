import java.util.*;
class Solution {
    public Integer[] solution(String today, String[] terms, String[] privacies) {
       ArrayList<Integer> arr = new ArrayList<>();
        
        //terms 2차원배열 0:A약관 1:개월수
        String[][] tt = new String[terms.length][2];        
        for(int i = 0; i < terms.length; i++) {
            String[] str = terms[i].split(" ");
            tt[i][0] = str[0];
            tt[i][1] = str[1];
        }
        
        //privacies substring -> 개월수 더하기
        for(int i = 0; i < privacies.length; i++) {
            String alphabet = privacies[i].substring(11,12);
            int month = Integer.parseInt(privacies[i].substring(5,7));
            int year = Integer.parseInt(privacies[i].substring(0,4));
            for(int j = 0; j < tt.length; j++) {
                if(tt[j][0].equals(alphabet)) {
                    month = month + Integer.parseInt(tt[j][1]);
                    if(month > 12) {
                        if(month % 12 == 0) {
                            year = year + month/12 - 1;
                            month = 12;
                        } else {
                            year = year + month/12;
                            month = month % 12;
                        }                    
                    }
                }              
            }
            String str = "";
            if(month >= 10) {
                str= String.valueOf(year) + String.valueOf(month) + privacies[i].substring(8,10);
            } else {
                str= String.valueOf(year) + "0" + String.valueOf(month) + privacies[i].substring(8,10);
            }
            System.out.println(str);
            privacies[i] = str;
        }
        
        //현재날짜와 비교
        today = today.substring(0,4) + today.substring(5,7) + today.substring(8,10);
        int t = Integer.parseInt(today);
        for(int i = 0; i < privacies.length; i++) {
            if(Integer.parseInt(privacies[i])-1 < t) {
                arr.add(i+1);
            }
        }
        Integer[] answer = arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}