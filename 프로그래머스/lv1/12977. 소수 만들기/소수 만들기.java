class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int h = j+1; h < nums.length; h++) {
                    if(i != j && j != h && i != h) {
                        if(count(nums[i] + nums[j] + nums[h]) == 2) {
                            answer++;
                        }
                    }
                }
            }
        }
        return answer;
    }
    
    //약수 갯수 구하기
    public int count(int n) {
        int count = 0;
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                count++;
                if(n/i != i) {
                    count++;
                }
            }
        }
        return count;
    } 
}