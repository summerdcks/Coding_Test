import java.util.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(my_string.substring(queries[i][0], queries[i][1]+1));
            String temp = sb.reverse().toString();
            my_string = my_string.substring(0, queries[i][0])
                + temp
                + my_string.substring(queries[i][1]+1, my_string.length());
        }
        return my_string;
    }
}