import java.util.*;

public class ComparingArrays {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		int[] a2 = new int[10];
		Arrays.fill(a1, 66);
		Arrays.fill(a2, 66);
		System.out.println("a1 == a2 : " + Arrays.equals(a1, a2));
		a2[3] = 88;
		System.out.println(Arrays.equals(a1, a2));

		String[] s1 = new String[4];
		Arrays.fill(s1, "Hi");
		String[] s2 = { new String("Hi"), new String("Hi"), new String("Hi"), new String("Hi") };
		System.out.println("s1 == s2 : " + Arrays.equals(s1, s2));
	}
}
