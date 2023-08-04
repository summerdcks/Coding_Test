class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int plus = 0;
        int[] arr = new int[n];
        for(int i = 0; i < lost.length; i++) { //lost는 -1
            arr[lost[i]-1] = -1;
        }
        for(int i = 0; i < reserve.length; i++) { //여벌은 +1
            if(arr[reserve[i]-1] == -1) {
                arr[reserve[i]-1] = 0;
                plus++;
            } else {
                arr[reserve[i]-1] = 1;
            }
        }
        
        int num = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != 0 && num + arr[i] == 0) {
                plus++;
                num = 0;
            } else {
                num = arr[i];
            }
        }
        System.out.println(plus);
        int answer = n - lost.length + plus;
        return answer;
    }
}