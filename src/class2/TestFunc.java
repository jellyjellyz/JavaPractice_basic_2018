package class2;

public class TestFunc {
	public static void main(String[] args) {
		int a = 1, b = 2;
		double c = add(a, b);
		System.out.println(c);

	}
	public static double add(double a, double b) {
		System.out.println("this is 1");
		return a + b;
	}
	public static double add(double a, int b) {
		System.out.println("this is 2");
		return a + b;
	}

}
