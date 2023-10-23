import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       int N = scanner.nextInt();
       int F = scanner.nextInt();
       int numb = 0;
       N = (N / 100) * 100;

       while(true) {
           if(N%F == 0) break;
           else {N++; numb++;}
       }
       if(numb < 10) {
           System.out.print("0" + numb);
       } else {
           System.out.println(numb);
       }
       
    }
}