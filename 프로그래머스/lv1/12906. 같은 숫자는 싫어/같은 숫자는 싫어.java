import java.util.*;

public class Solution {
     public static ArrayList<Integer> solution(int []arr) {
		 ArrayList<Integer> answer = new ArrayList<>();
		 int temp = arr[0];
		 answer.add(temp);
		 for(int i=1; i < arr.length; i++) {
			 if(arr[i] == temp) {
			 } else {
				 answer.add(arr[i]);
				 temp = arr[i];
			 }
		 }
	     return answer;
	    }
}