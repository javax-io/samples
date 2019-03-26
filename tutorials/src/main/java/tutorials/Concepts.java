package tutorials;
/**
 *
 */
public class Concepts {
	//GENERIC SHAPE
	interface Shape {
		int sides();
	}
	//TRIANGLE SHAPE
	static class Triangle implements Shape {
		@Override
		public int sides() {
			return 3;
		}
	}
	//RECTANGLE SHAPE
	static class Rectangle implements Shape {
		@Override
		public int sides() {
			return 4;
		}
	}
	public static void main(String[] args) {
		Shape triangle = new Triangle();
		Shape rectangle= new Rectangle();
		
		System.out.println("Triangle has " + triangle.sides() + " sides");
		System.out.println("Rectangle has " + rectangle.sides() + " sides");
	}
}
