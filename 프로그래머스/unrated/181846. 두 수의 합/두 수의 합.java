import java.math.*;
class Solution {
    public String solution(String a, String b) {     
        BigInteger big1 = new BigInteger(a);
        BigInteger big2 = new BigInteger(b);
        BigInteger big3 = big1.add(big2);
        String answer = big3.toString();
        return answer;
    }
}