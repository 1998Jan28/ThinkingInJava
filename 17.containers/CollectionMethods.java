import java.util.*;

public class CollectionMethods {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		c.addAll(Arrays.asList(1,2,3,4,5,6));
		c.add(7);
		c.add(8);
		System.out.println(c);

		Object[] array = c.toArray();
		Integer[] ints = c.toArray(new Integer[0]);

		System.out.println("Collections.max(c) = " + Collections.max(c));
		System.out.println("Collections.min(c) = " + Collections.min(c));

		Collection c2 = new ArrayList<Integer>();
		c2.addAll(Arrays.asList(1,2,3,4,5,6));
		c.addAll(c2);
		System.out.println(c);

		c.remove(1);
		c.remove(2);
		System.out.println(c);

		c.removeAll(c2);
		System.out.println(c);

		c.addAll(c2);
		System.out.println(c);

		System.out.println(c.contains(3));
		System.out.println(c.containsAll(c2));

		Collection<Integer> c3 = ((List<Integer>)c).subList(3, 5);
		c2.retainAll(c3);
		System.out.println(c2);
		c2.removeAll(c3);
		System.out.println(c2.isEmpty());

		c = new ArrayList<Integer>();
		c.addAll(Arrays.asList(1,2,3,4,5));
		c.clear();
		System.out.println("After clear: " + c);
	}
}
