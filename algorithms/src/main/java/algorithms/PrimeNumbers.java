package algorithms;

import java.util.function.Function;

/**
 * Return a number of prime number between [1, num]
 * 
 */
public class PrimeNumbers implements Function<Integer, Integer> {
	@Override
	public Integer apply(Integer num) {
		int count = 0;
	    for(int n = 2; n <= num; n ++) {
	    	if(isPrime(n)) {
	    		count ++;
	    		System.out.println(n);
	    	}
	    } 
		return count;
	}
	/**
	 * Test if a prime number
	 */
	boolean isPrime(int n) {
	    if(n == 2) {
	        return true;
	    }
	    if(n == 1 || n % 2 == 0) {
	        return false;
	    }
	    for(int i = 3; i < n; i++) {
	        if(n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
