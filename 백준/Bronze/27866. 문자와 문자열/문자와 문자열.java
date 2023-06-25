import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.next();
		int number = scanner.nextInt();
		char [] arr = sentence.toCharArray();
		System.out.println(arr[number-1]);		
	}
}
