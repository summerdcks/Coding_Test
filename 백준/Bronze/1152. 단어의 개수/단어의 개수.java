import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		
		String [] s = sentence.split(" ");
		int count = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("")) {
				count++;
			}
		}
		System.out.println(s.length - count);
	}

}
