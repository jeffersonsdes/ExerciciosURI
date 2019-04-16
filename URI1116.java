import java.util.Locale;
import java.util.Scanner;

public class URI1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if (y != 0) {
				double divisao = x / y;
				System.out.println(divisao);
			} else {
				System.out.println("divisao impossivel");

			}

		}

	}

}
