import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        if(min >= 45) {min -= 45;}
        else {min = min + 15; hour -= 1;}
        if(hour == -1) {hour = 23;}
        System.out.println(hour + " " + min);
    }
}