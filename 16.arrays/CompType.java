import java.util.*;

public class CompType implements Comparable<CompType> {
	int i;
	int j;
	private static int count = 1;
	public CompType(int n1, int n2) {
		i = n1;
		j = n2;
	}
	public String toString() {
		String result = "[i = " + i + ", j = " + j + "]";
		if(count++ % 3 == 0) result += "\n";
		return result;
	}
	public int compareTo(CompType rv) {
		return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
	}
	private static Random rand = new Random(66);
	public static Generator<CompType> generator() {
		return new Generator<CompType>() {
			public CompType next() {
				return new CompType(rand.nextInt(100), rand.nextInt(100));
			}
		};
	}
	public static void main(String[] args) {
		CompType[] a = new CompType[9];
		Generator<CompType> gc = generator();
		for(int i = 0; i < 9; ++i) {
			a[i] = gc.next();
		}
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(a));
		System.out.println("Reverse Sorting: ");
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
}
