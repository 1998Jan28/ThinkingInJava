import java.util.*;

public class QueueDemo {
	public static void printQ(Queue queue) {
		while(queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Queue<Character> qc = new LinkedList<Character>();
		for(char c : "Never Give Up".toCharArray()) {
			qc.offer(c);
		}
		printQ(qc);
	}
}
