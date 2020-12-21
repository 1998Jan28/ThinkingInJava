import java.util.*;

public class FillingArrays {
	public static void main(String[] args) {
		int size = 6;
		int[] a = new int[size];
		Arrays.fill(a, 66);
		System.out.println(Arrays.toString(a));

		String[] s = new String[size];
		Arrays.fill(s, "Hello");
		Arrays.fill(s, 3, 5, "World");
		System.out.println(Arrays.toString(s));
	}
}
