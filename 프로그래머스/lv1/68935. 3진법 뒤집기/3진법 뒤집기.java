class Solution {
    public int solution(int n) {
        int answer = 0;
        String sam = "";
        while(true) {
            if(n < 3) {
                sam = n + sam ;
                break;
            }
            sam = n%3 + sam ;
            n = n/3;
        }
        System.out.println(sam);
        String sip = "";
        int m = 1;
        for(int i =sam.length()-1; i >= 0; i--) {
            sip = sip + sam.charAt(i);           
        }      
        System.out.println(sip);
         for(int i =sip.length()-1; i >= 0; i--) {
            answer = answer + Character.getNumericValue(sip.charAt(i)) * m;
            m = m * 3;
        }
        return answer;
    }
}