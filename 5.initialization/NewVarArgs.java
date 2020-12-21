class A {}

public class NewVarArgs {
	static void printArray(Object... args) {
		for(Object obj : args) 
			System.out.print(obj + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// Individual elements
		printArray(new Integer(27), new Float(3.33), new Double(11.11));
		printArray(27, 3.33, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		// An array
		printArray((Object[])new Integer[]{1, 2, 3, 4, 5});
		printArray(); // Empty list is OK
	}
}
