class Solution {
    public int[][] solution(int[][] arr) {        
        int row = arr.length; //행
        int column = arr[0].length; //열
        int[][] answer = new int [Math.max(row,column)][Math.max(row,column)];
        if(row == column) {
            return arr;
        }
        if(row < column) {
            for(int i = 0; i < row; i++){
                answer[i] = arr[i];
            }
        }
        if(row > column) {
            for(int i = 0; i < row; i++){
                for(int j = 0; j < column; j++) {
                    answer[i][j] = arr[i][j];
                }
            }
        }
        return answer;
    }
}