package tutorials;
/**
 *
 */
public class Arrays {
	public static void main(String[] args) {
	    int n = Integer.valueOf(args[0]);
	    double[] a;                    // declare the array
        a = new double[n];             // create the array
        for (int i = 0; i < n; i++){   // elements are indexed from 0 to n-1
           a[i] = Math.random();       // initialize all elements to random value
        }
        
        //print out all value using for each
        for(double v: a) {
            System.out.println(v);
        }
	}
}
