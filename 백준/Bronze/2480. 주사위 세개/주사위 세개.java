import java.util.*;
class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();
        if(N1 == N2 && N2 == N3) {
            answer = 10000 + N1 * 1000;
        } else if(N1 == N2 && N2 != N3) {
            answer = 1000 + N1 * 100;
        } else if(N2 == N3 && N1 != N2) {
            answer = 1000 + N2 * 100;
        } else if(N1 == N3 && N2 != N3) {
            answer = 1000 + N1 * 100;
        } else if(N1 != N2 && N2 != N3) {
            int maxNum = Math.max(N1, N2);
            maxNum = Math.max(maxNum, N3);
            answer = maxNum * 100;
        }
        System.out.println(answer);
    }
}