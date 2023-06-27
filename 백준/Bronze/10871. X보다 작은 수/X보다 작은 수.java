import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			int numb = scanner.nextInt();
			arr.add(numb);
		}
		for(int i = 0; i < N; i++) {
			if(arr.get(i) < X) {System.out.println(arr.get(i));}
		}
		
	}
}
