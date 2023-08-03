class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int days=0;
        for(int i = 1; i < a; i++) {
            if(i == 1) days += 31;
            if(i == 2) days += 29;
            if(i == 3) days += 31;
            if(i == 4) days += 30;
            if(i == 5) days += 31;
            if(i == 6) days += 30;
            if(i == 7) days += 31;
            if(i == 8) days += 31;
            if(i == 9) days += 30;
            if(i == 10) days += 31;
            if(i == 11) days += 30;
            if(i == 12) days += 31;
        }
        days += (b-1);
        days = days % 7;
        if(days == 0) answer = "FRI";
        if(days == 1) answer = "SAT";
        if(days == 2) answer = "SUN";
        if(days == 3) answer = "MON";
        if(days == 4) answer = "TUE";
        if(days == 5) answer = "WED";
        if(days == 6) answer = "THU";
        return answer;
    }
}