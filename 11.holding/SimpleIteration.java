import java.util.*;

public class SimpleIteration {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("aa");
		ls.add("bb");
		ls.add("cc");
		Iterator<String> it = ls.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		for(String s : ls) {
			System.out.println(s);
		}
		it = ls.iterator();
		it.next();
		it.remove();
		System.out.println(ls);
	}
}
