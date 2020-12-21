class Automobile {}

public class GenericHolder<T> {
	private T a;
	public GenericHolder(T a) {
		this.a = a;
	}
	public void set(T a) {
		this.a = a;
	}
	public T get() {
		return a;
	}
	public static void main(String[] args) {
		GenericHolder<Automobile> gh = new GenericHolder<Automobile>(new Automobile());
		Automobile a = gh.get();
		// gh.set(1);  // Error
	}
}
