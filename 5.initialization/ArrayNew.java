import java.util.*;

public class ArrayNew {
	public static void main(String[] args) {
		Random rand = new Random(23);
		int[] a = new int[rand.nextInt(15)];
		System.out.println(a.length);
		System.out.println(Arrays.toString(a));
	}
}
