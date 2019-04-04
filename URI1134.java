import java.util.Locale;
import java.util.Scanner;

public class URI1134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int ContGas = 0;
		int ContAlc = 0;
		int ContDie = 0;
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				ContAlc++;
			} else if (tipo == 2) {
				ContGas++;
			} else if (tipo == 3) {
				ContDie++;
			}
			tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + ContAlc);
		System.out.println("Gasolina: " + ContGas);
		System.out.println("Diesel: " + ContDie);

		sc.close();
	}

}