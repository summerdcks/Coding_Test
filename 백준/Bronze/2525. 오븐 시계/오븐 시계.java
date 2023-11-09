import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        int min = scanner.nextInt();
        int time = scanner.nextInt();
        if((min + time) >= 60) {
            hour += (min + time)/60;
            min = (min + time) % 60;
        } else {
            min = min + time;
        }
        if(hour >= 24) {
            hour = hour % 24;
        }
        System.out.println(hour + " " + min);
    }
}