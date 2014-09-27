import java.util.Scanner;

public class Class01 {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		final double EPSILON = 1e-9;
		double s = 0.0;
		int k = 1;
		double p = 1;
		double a;
		double x = scanner.nextDouble();

		do {
			System.out.println("SUM: " + s);
			p *= x;
			a = (k + 1) * (k + 1) * k / p;
			System.out.println("A:   " + a);
			s += a;
			k += 1;
		}
		while (Math.abs(a) > EPSILON);

		System.out.println(s);

	}

}