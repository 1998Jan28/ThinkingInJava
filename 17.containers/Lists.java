import java.util.*;

public class Lists {
	private static boolean b;
	private static String s;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;

	public static void basicTest(List<String> a) {
		a.add(1, "x");
		a.add("x");
		a.addAll(Arrays.asList("y", "z", "w"));
		a.addAll(3, Arrays.asList("a", "b", "c"));

		b = a.contains("1");
		b = a.containsAll(Arrays.asList("a", "b", "c"));

		s = a.get(1);
		i = a.indexOf("1");
		b = a.isEmpty();
		
		it = a.iterator();
		lit = a.listIterator();
		lit = a.listIterator(3);
		i = a.lastIndexOf("1");

		a.remove(1);
		a.remove("3");
		a.set(1, "p");

		a.retainAll(Arrays.asList("a", "b", "c"));
		a.removeAll(Arrays.asList("a", "b", "c"));

		i = a.size();
		a.clear();
	}

	public static void iterMotion(List<String> a) {
		ListIterator<String> it = a.listIterator();
		b = it.hasNext();
		b = it.hasPrevious();
		s = it.next();
		i = it.nextIndex();
		s = it.previous();
		i = it.previousIndex();
	}

	public static void iterManipulation(List<String> a) {
		ListIterator<String> it = a.listIterator();
		it.add("22");
		it.next();
		it.remove();
		it.next();
		it.set("33");
	}

	public static void testLinkedList() {
		LinkedList<String> ll = new LinkedList<String>();
		ll.addAll(Arrays.asList("a", "b", "c"));
		System.out.println(ll);

		ll.addFirst("one");
		ll.addFirst("two");
		System.out.println(ll);

		System.out.println(ll.getFirst());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
	}
}
