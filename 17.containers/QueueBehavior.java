import java.util.*;
import java.util.concurrent.*;

public class QueueBehavior {
	private static int count = 10;
	static void test(Queue<Integer> queue) {
		for(int i = count - 1; i >= 0; --i) {
			queue.offer(i);
		}
		while(queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		test(new LinkedList<Integer>());
		test(new PriorityQueue<Integer>());
		test(new ArrayBlockingQueue<Integer>(count));
		test(new ConcurrentLinkedQueue<Integer>());
		test(new LinkedBlockingQueue<Integer>());
		test(new PriorityBlockingQueue<Integer>());
	}
}
