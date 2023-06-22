import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer> integers = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int number = scanner.nextInt();
			integers.add(number);
		}
		 Collections.sort(integers);
		 System.out.print(integers.get(0) + " " + integers.get(integers.size()-1));
	}

}
