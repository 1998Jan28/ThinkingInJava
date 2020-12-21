class Vehicle {}
class Fruit {}

public class TupleTest {
	static TwoTuple<String, Integer> f() {
		return new TwoTuple<String, Integer>("hi", 18);
	}
	static ThreeTuple<Vehicle, String, Integer> g() {
		return new ThreeTuple<Vehicle, String, Integer>(new Vehicle(), "hi", 18);
	}

	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(g());
	}
}
