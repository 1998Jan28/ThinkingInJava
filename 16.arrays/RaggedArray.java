import java.util.*;

public class RaggedArray {
	public static void main(String[] args) {
		Random rand = new Random(66);
		int[][][] a = new int[rand.nextInt(6)][][];
		for(int i = 0; i < a.length; ++i) {
			a[i] = new int[rand.nextInt(5)][];
			for(int j = 0; j < a[i].length; ++j) {
				a[i][j] = new int[rand.nextInt(5)];
			}
		}
		System.out.println(Arrays.deepToString(a));
	}
}
