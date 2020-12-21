public class IntegerMatch {
	public static void main(String[] args) {
		System.out.println("-123".matches("-?\\d+"));
		System.out.println("567".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d+"));
	}
}
