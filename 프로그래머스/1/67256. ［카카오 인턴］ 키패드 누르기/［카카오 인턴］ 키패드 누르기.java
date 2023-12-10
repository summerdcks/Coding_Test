import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] arr = {
            {0,0}, {0,1}, {0,2},
            {1,0}, {1,1}, {1,2},
            {2,0}, {2,1}, {2,2},
            {3,0}, {3,1}, {3,2}
        };
        int[] left = arr[9];
        int[] right = arr[11];
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                left = arr[numbers[i] -1];
                answer += "L";
            } else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                right = arr[numbers[i] -1];
                answer += "R";
            } else {
                int[] spot = {};
                if(numbers[i] != 0) {
                    spot = arr[numbers[i] -1];
                } else {
                    spot = arr[10];
                }
                int leftDistance = Math.abs(spot[0]-left[0])+Math.abs(spot[1]-left[1]);
                int rightDistance = Math.abs(spot[0]-right[0])+Math.abs(spot[1]-right[1]);
                if(leftDistance < rightDistance) {
                    left = spot;
                    answer += "L";
                } else if(leftDistance > rightDistance) {
                    right = spot;
                    answer += "R";
                } else {
                    if(hand.equals("left")) {
                        left = spot;
                        answer += "L";
                    } else {
                        right = spot;
                        answer += "R";
                    }
                }
            }           
        }
        return answer;
    }
}