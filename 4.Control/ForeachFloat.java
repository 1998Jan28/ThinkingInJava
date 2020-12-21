import java.util.*;

public class ForeachFloat {
	public static void main(String[] args) {
		Random rand = new Random(21);
		double d[] = new double[10];
		for(int i = 0, j = 1; i < 10; ++i, ++j) {
			d[i] = rand.nextDouble() * j;
		}
		for(double x : d) {
			System.out.println(x);
		}
		int i = 1, j = 2;
		System.out.println(i * j);
	}
}
