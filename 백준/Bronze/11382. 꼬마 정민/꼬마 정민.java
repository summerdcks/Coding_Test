
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger a = scanner.nextBigInteger();
	    BigInteger b = scanner.nextBigInteger();
	    BigInteger c = scanner.nextBigInteger();
	    BigInteger sum = a.add(b).add(c);
	    System.out.println(sum.toString());
		
	}
}
