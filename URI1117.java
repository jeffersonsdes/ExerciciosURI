import java.util.Locale;
import java.util.Scanner;

public class URI1117 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double notaA = sc.nextDouble();
		
		while (notaA < 0 || notaA > 10) {
			System.out.println("nota invalida");
			notaA = sc.nextDouble();
		}
		
		
		double notaB = sc.nextDouble();
		
		while (notaB < 0 || notaB > 10) {
			System.out.println("nota invalida");
			notaB = sc.nextDouble();
		}
		double media = (notaA + notaB) / 2;

			System.out.printf("media = %.2f%n", media);
			sc.close();
		}

	}


