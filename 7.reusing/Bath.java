class Soap {
	private String s;
	Soap() {
		System.out.println("Soap()");
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
}

public class Bath {
	// Initializing at point of definition
	private String s1 = "Happy", s2 = "Happy", s3, s4;
	private Soap castille;
	private int i;
	private float toy;

	// Constructor initialization
	public Bath() {
		System.out.println("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}

	// Instance initialization
	{
		i = 38;
	}

	public String toString() {
		return "ToString()";
	}

	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);
	}
}
