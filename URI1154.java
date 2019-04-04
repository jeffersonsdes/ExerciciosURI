import java.util.Locale;
import java.util.Scanner;

public class URI1154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int soma = 0;
		int cont = 0;
		
		int idade = sc.nextInt();
		
		
		while(idade >= 0) {
			soma = soma + idade;
			cont = cont+1;
		
		idade = sc.nextInt();
		}
		double media = (double) soma / cont;
		
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}
