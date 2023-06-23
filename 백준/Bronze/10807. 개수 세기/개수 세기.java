
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i = 0; i < number; i++) {
			int numb = scanner.nextInt();
			arr.add(numb);
		}
		int find = scanner.nextInt();
		int count = 0;
		for(int i = 0; i < arr.size(); i++) {
			if(find == arr.get(i)) {
				count++;
			}
		}
		System.out.println(count);
	}

}
