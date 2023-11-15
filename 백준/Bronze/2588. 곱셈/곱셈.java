import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int answer1 = num1 * (num2 % 10);
        int answer2 = num1 * ((num2 % 100) / 10);
        int answer3 = num1 * (num2 / 100);
        int answer4 = answer1 + answer2 * 10 + answer3 * 100;
        System.out.print(answer1 + "\n"
                            + answer2 + "\n"
                            + answer3 + "\n"
                            + answer4);
    }
}