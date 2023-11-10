import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       if(num1 > 0 && num2 > 0) System.out.println("1");
       if(num1 < 0 && num2 > 0) System.out.println("2");
       if(num1 < 0 && num2 < 0) System.out.println("3");
       if(num1 > 0 && num2 < 0) System.out.println("4");
    }
}