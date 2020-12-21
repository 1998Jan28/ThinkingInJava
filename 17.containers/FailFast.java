import java.util.*;

public class FailFast {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("Str");
		Iterator<String> it = c.iterator();
		c.add("Object");
		try {
			String s = it.next();
		} catch(ConcurrentModificationException e) {
			System.out.println(e);
		}
	}
}
