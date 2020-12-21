import java.util.*;

public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(36);
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i = 0; i < 10000; ++i) {
			int t = rand.nextInt(20);
			Integer freq = m.get(t);
			m.put(t, freq == null ? 1 : freq + 1);
		}
		System.out.println(m);
	}
}
