class Automobile {}

public class ObjectHolder {
	private Object a;
	public ObjectHolder(Object a) {
		this.a = a;
	}
	public void set(Object a) {
		this.a = a;
	}
	public Object get() {
		return a;
	}
	public static void main(String[] args) {
		ObjectHolder oh = new ObjectHolder(new Automobile());
		Automobile a = (Automobile)oh.get();
		oh.set("Not an Automobile");
		String s = (String)oh.get();
		oh.set(1);    // Autoboxes to Integer
		Integer x = (Integer) oh.get();
	}
}
