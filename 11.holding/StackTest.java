public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for(String s : "Never Give Up".split(" ")) {
			stack.push(s);
		}
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}
}
