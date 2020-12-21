import java.util.*;

class Bery {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {
		return "Sphere " + id;
	}
}

public class ContainerComparison {
	public static void main(String[] args) {
		Bery[] sphere = new Bery[10];
		for(int i = 0; i < 5; ++i) {
			sphere[i] = new Bery();
		}
		System.out.println(Arrays.toString(sphere));
		System.out.println(sphere[3]);

		List<Bery> sphereList = new ArrayList<Bery>();
		for(int i = 0; i < 5; ++i) {
			sphereList.add(new Bery());
		}
		System.out.println(sphereList);
		System.out.println(sphereList.get(3));

		int[] integers = { 0, 1, 2, 3, 4, 5,  };
		System.out.println(Arrays.toString(integers));
		System.out.println(integers[2]);

		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
		intList.add(66);
		System.out.println(intList);
		System.out.println(intList.get(2));
	}
}
