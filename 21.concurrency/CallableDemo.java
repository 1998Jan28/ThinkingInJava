import java.util.concurrent.*;
import java.util.*;

class TaskWithResult implements Callable<String> {
	private int id;

	public TaskWithResult(int id) {
		this.id = id;
	}

	public String call() {
		return "result of TaskWithResult " + id;
	}
}

public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for(int i = 0; i < 10; ++i) {
			results.add(exec.submit(new TaskWithResult(i)));
		}
		try {
			for(Future<String> fs : results) {
				System.out.println(fs.get());
			}
		} catch(InterruptedException e) {
			System.out.println(e);
			return;
		} catch(ExecutionException e) {
			System.out.println(e);
			return;
		} finally {
			exec.shutdown();
		}
	}
}
