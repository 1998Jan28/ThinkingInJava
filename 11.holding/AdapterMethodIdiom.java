import java.util.*;

class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}

	public Iterable<T> reversed() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					int current = size() - 1;
					public boolean hasNext() {
						return current > -1;
					}
					public T next() {
						return get(current--);
					}
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}

public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<String>(Arrays.asList(("Never Give Up!").split(" ")));
		for(String s : ral) {
			System.out.print(s + " ");
		}
		System.out.println();
		for(String s : ral.reversed()) {
			System.out.println(s + " ");
		}
	}
}
