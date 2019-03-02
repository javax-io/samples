package templates;

import java.util.function.Function;

/**
 * A hello world using java function.
 * 
 */
public class HelloFunction implements Function<String, String> {
	@Override
	public String apply(String t) {
		return "Hello Function!";
	}
}
