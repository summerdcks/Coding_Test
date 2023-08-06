class Solution {
    public int[] solution(String[] park, String[] routes) {
        //문제 세팅
        int sx = 0;
        int sy = 0;
        
        char[][] arr = new char[park.length][park[0].length()];
        
        for(int i = 0; i < park.length; i++) {
            arr[i] = park[i].toCharArray();
            
            if(park[i].contains("S")) {
                sy = i;
                sx = park[i].indexOf("S");
            }
        }
        
        //풀이 
        for(String str : routes) {
            String dir = str.split(" ")[0];
            int len = Integer.parseInt(str.split(" ")[1]);
            
            //일단 가봐
            int nx = sx;
            int ny = sy;
            
            for(int i = 0; i < len; i++) {
                if(dir.equals("E")) {
                    nx++;
                }
                if(dir.equals("W")) {
                    nx--;
                }
                if(dir.equals("S")) {
                    ny++;
                }
                if(dir.equals("N")) {
                    ny--;
                }
                
                if(nx >= 0 && nx < arr[0].length && ny >= 0 && ny < arr.length) { // 범위 안에 있으면
                    if(arr[ny][nx] == 'X') { //장애물 있을때 적용x
                        break;
                    }
                    if(i == len-1) { // 장애물 없을때 적용o
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }
        int[] answer = {sy, sx};
        return answer;
    }
}