package algorithms;

import java.util.function.Function;

/**
 *
 */
public class SquareRoots implements Function<Integer, Float> {
	@Override
	public Float apply(Integer num) {
		//find closet perfect number
		float sqrt = 1.0f;
		while(sqrt * sqrt < num) {
			sqrt ++;
		}
		float err;
		while((err = sqrt * sqrt - num) > 0.01 || err < -0.01) {
			sqrt = (num / sqrt + sqrt)/2;
		}
		return sqrt;
	}
}
