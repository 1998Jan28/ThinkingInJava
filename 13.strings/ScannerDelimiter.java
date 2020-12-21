import java.util.*;

public class ScannerDelimiter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("12, 32, 78, 99, 66");
		scanner.useDelimiter("\\s*,\\s*");
		while(scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
		}
	}
}
