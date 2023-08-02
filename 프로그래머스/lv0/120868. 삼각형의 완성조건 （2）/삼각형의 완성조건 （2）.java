class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        //max가 가장 큰 변일때
        int a = Math.max(sides[0], sides[1]) - Math.min(sides[0], sides[1]) + 1;
        answer = Math.max(sides[0], sides[1]) - a;
        //큰변이 따로 있을때
        answer += Math.max(sides[0], sides[1]) + Math.min(sides[0], sides[1]) -Math.max(sides[0], sides[1]);
         return answer;
    }
}