package tutorials;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Example sort strings using custom comparator
 */
public class LambdaExpressions {
	public static void main(String[] args) {
		//using a lambda function instead of implement a comparator.
		Comparator<String> c = (s1, s2) -> {
			return s1.length() - s2.length();
		};
		
		//sort by length
		Arrays.sort(args, c);
		for(String s: args) {
		    System.out.println(s);
		}
	}
}