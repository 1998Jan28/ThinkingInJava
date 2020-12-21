import java.util.*;

class Apple {
	private static long counter;
	private final long id = counter++;
	public long id() {
		return id;
	}
}

class Gala extends Apple {}

class Fuji extends Apple {}

public class GenericsAndUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple());
		apples.add(new Gala());
		apples.add(new Fuji());
		for(Apple c : apples) {
			System.out.println(c);
		}
	}
}
