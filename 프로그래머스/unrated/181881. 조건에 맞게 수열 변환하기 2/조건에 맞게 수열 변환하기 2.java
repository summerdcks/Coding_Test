import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int count = 0;
        int[] original = new int[arr.length];
        for(int i =0; i<arr.length; i++) {
            original[i] = arr[i];
        }
        while(true) {
           
            arr = original;
            int[] a = calculate(arr, count);
            arr = original;
            int[] b = calculate(arr, count+1);    
            int same = 0;
            for(int i = 0; i < arr.length; i++) {
                if(a[i] == b[i]) {
                    same++;
                }
            } 
            if(same == a.length) {
                break;
            }
             count++; 
        } 
        return count;
    }
    
     public int[] calculate(int[] array, int n) {
         if(n == 0) return array;
        int count = 0;
        int[] ret = new int[array.length];
        for(int i =0; i<array.length; i++) {
            ret[i] = array[i];
        }
        while(true) {
            for(int i=0; i<ret.length; i++) {
                if(ret[i] >=50 && ret[i] %2==0) {
                    ret[i] = ret[i]/2;
                } else if(ret[i] <50 && ret[i] %2!=0) {
                    ret[i] = ret[i]*2 +1;
                }
            }
            count++;
            if(count == n) break;
        }
        return ret;
    }
}
