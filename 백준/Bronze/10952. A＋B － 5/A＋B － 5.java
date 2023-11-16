import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if(num1 == 0 && num2 == 0) break;
            System.out.println(num1 + num2);
        }
    }
}