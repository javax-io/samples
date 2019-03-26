package tutorials;

public class Operators {
	public static void main(String[] args) {
		int v = 10;
		//print 10 and v = 11
		System.out.println(v++);
		
		//print 11 and v = 10
		System.out.println(v--);
		
		//print 11 and v = 11
		System.out.println(++v);
		
		//print 10 and v = 10
		System.out.println(--v);
		
		v = -v;
		//v = -10
		System.out.println(v);
		
		v += 10;
		//v = 0
		System.out.println(v);
	}
}
