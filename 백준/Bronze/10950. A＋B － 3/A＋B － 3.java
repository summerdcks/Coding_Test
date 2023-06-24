import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < number; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			arr.add(a+b);
		}
		for(Integer numb : arr) {
			System.out.println(numb);
		}
	}

}
