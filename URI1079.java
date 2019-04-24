import java.util.Locale;
import java.util.Scanner;

public class URI1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			double mPond = ((valor1*2) + (valor2*3) + (valor3*5)) / 10 ;
			System.out.printf("%.1f%n", mPond);
		}
		
	}

}
