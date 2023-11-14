import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++) {
            int numb = scanner.nextInt();
            arr[i] = numb;
        }
        int answer = 0;
        int index = 0;
        for(int i = 0; i < 9; i++) {
           if(arr[i] > answer) {
               answer = arr[i];
               index = i;
           }
        }
        index += 1;
        System.out.println(answer + "\n" + index);        
    }
}