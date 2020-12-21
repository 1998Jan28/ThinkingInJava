import java.util.*;

public class CopyingArrays {
	public static void main(String[] args) {
		int[] i = new int[7];
		int[] j = new int[10];
		Arrays.fill(i, 66);
		Arrays.fill(j, 88);
		System.out.println("i = " + Arrays.toString(i));
		System.out.println("j = " + Arrays.toString(j));
		System.arraycopy(i, 0, j, 0, i.length);
		System.out.println("After copy  j = " + Arrays.toString(j));
	}
}
