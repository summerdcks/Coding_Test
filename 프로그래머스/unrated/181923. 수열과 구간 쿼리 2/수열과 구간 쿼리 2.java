import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            answer[i] = -1;
        }
        //Arrays.sort(arr);
        for(int i = 0; i < queries.length; i++) {
            int[] newArr = new int[queries[i][1] - queries[i][0] + 1];
            for(int j = queries[i][0]; j < queries[i][1] + 1; j++) {
                newArr[j - queries[i][0]] = arr[j];
            }
            Arrays.sort(newArr);
            for(int j = 0; j < newArr.length; j++) {
                if(newArr[j] > queries[i][2]) {
                    answer[i] = newArr[j];
                    break;
                }
            }     
        }
        return answer;
    }
}