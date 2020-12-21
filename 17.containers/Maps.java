import java.util.concurrent.*;
import java.util.*;

public class Maps {
	public static void printKeys(Map<Integer, String> map) {
		System.out.println("Size = " + map.size() + ", ");
		System.out.println("Keys: ");
		System.out.println(map.keySet());
	}
	public static void test(Map<Integer, String> map) {
		System.out.println("------" + map.getClass().getSimpleName() + "------");
		map.put(1, "red");
		map.put(2, "green");
		map.put(3, "blue");
		map.put(4, "yellow");
		map.put(5, "white");
		map.put(6, "black");
		printKeys(map);
		System.out.println("Values: " + map.values());
		System.out.println(map);

		System.out.println(map.containsKey(5));
		System.out.println(map.get(2));
		System.out.println(map.containsValue("red"));

		Integer key = map.keySet().iterator().next();
		System.out.println(key);
		map.remove(key);
		printKeys(map);

		map.clear();
		System.out.println(map.isEmpty());
	}
	public static void main(String[] args) {
		test(new HashMap<Integer, String>());
		test(new LinkedHashMap<Integer, String>());
		test(new TreeMap<Integer, String>());
		test(new IdentityHashMap<Integer, String>());
		test(new ConcurrentHashMap<Integer, String>());
		test(new WeakHashMap<Integer, String>());
	}
}
