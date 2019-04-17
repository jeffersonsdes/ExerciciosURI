import java.util.Locale;
import java.util.Scanner;

public class URI1142 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i=1; i<N*4; i=i+4) {
			System.out.printf("%d %d %d PUM%n", i, i+1, i+2);

		}

	}

}
