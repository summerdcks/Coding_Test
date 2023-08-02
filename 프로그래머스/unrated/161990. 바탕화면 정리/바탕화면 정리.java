class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int lux = 50;  //lux 시작점 세로축최소값
        int luy = 50;  //luy 시작점 가로축최소값
        int rdx = 0;  //rdx 끝점 세로축최대값
        int rdy = 0;  //rdy 끝점 가로축최대값
        
        //luy 가로축최소값
        for(int i = 0 ; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    luy = Math.min(luy, j);
                }
            }
        }
        //rdy 가로축최대값
         for(int i = wallpaper.length-1 ; i >= 0 ; i--) {
            for(int j = wallpaper[i].length()-1; j >= 0 ; j--) {
                if(wallpaper[i].charAt(j) == '#') {
                    rdy = Math.max(rdy, j);
                }
            }
        }       
        //lux 세로축최소값
        for(int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                lux = i;
                break;                
            }
        }
        //rdx 세로축최대값
        for(int i = wallpaper.length-1; i >=0 ; i--) {
            if(wallpaper[i].contains("#")) {
                rdx = i;
                break;                
            }
        }
        answer[0]=lux;
         answer[1]=luy;
         answer[2]=rdx+1;
         answer[3]=rdy+1;
        return answer;
    }
}