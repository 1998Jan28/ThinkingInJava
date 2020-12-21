import java.util.*;

public class ComparatorTest {
	public static void main(String[] args) {
		CompType[] a = new CompType[9];
		Generator<CompType> gc = CompType.generator();
		for(int i = 0; i < 9; ++i) {
			a[i] = gc.next();
		}

		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(a));

		Arrays.sort(a, new Comparator<CompType>() {
			public int compare(CompType o1, CompType o2) {
				return (o1.j < o2.j ? -1 : (o1.j == o2.j ? 0 : 1));
			}
		});

		System.out.println("After sorting: ");
		System.out.println(Arrays.toString(a));
	}
}
