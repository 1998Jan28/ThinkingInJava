import java.util.*;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		linkedMap.put(1, "one");
		linkedMap.put(2, "two");
		linkedMap.put(3, "three");
		linkedMap.put(4, "four");
		linkedMap.put(5, "five");
		System.out.println(linkedMap);

		linkedMap = new LinkedHashMap<Integer, String>(16, 0.75f, true);
		linkedMap.put(1, "one");
		linkedMap.put(2, "two");
		linkedMap.put(3, "three");
		linkedMap.put(4, "four");
		linkedMap.put(5, "five");
		System.out.println(linkedMap);
		linkedMap.get(1);
		System.out.println(linkedMap);
	
	}
}
