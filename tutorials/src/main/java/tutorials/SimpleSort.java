package tutorials;

import java.util.function.Function;
/**
 * Sample of executing a java function directly without main()
 */
public class SimpleSort implements Function<Integer[], Integer[]> {
	@Override
	public Integer[] apply(Integer[] t) {
		for(int i = 0; i < t.length; i ++) {
			for(int j = i + 1; j < t.length; j ++) {
				if(t[i] > t[j]) {
					int tmp = t[i];
					t[i] = t[j];
					t[j] = tmp;
				}
			}
		}
		return t;
	}
}