import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
