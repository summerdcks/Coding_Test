import java.util.ArrayList;
import java.util.Arrays;
class Solution {
   	 public static int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int [commands.length];
	        for(int a = 0; a < commands.length; a++) {
	            int[] arr = new int[commands[a][1] - commands[a][0] +1];
	            for(int i = commands[a][0]-1; i < commands[a][1]; i++) {
	                arr[i - (commands[a][0]-1)] = array[i];
	            }
	            Arrays.sort(arr);
	            answer[a] = arr[commands[a][2]-1];
	        }
	        return answer;
	    }
}