package algorithms;

import java.util.StringTokenizer;
import java.util.function.Function;
/**
 * Take an input string and reverses all the words.
 *
 */
public class ReverseString implements Function<String, String> {
	@Override
	public String apply(String str) {
		//token split by whitespace
		StringTokenizer tokenizer = new StringTokenizer(str);
		StringBuilder sb = new StringBuilder();
		while(tokenizer.hasMoreTokens()) {
			if(sb.length() > 0) {
				sb.insert(0, ' ');
			}
			sb.insert(0, tokenizer.nextToken());
		}
		return sb.toString();
	}
}
