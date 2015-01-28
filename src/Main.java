import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int valor = 1;
		int cont100;
		int cont50;
		int cont20;
		int cont10;

		while (valor > -1) {
			try {
				System.out.println("\nDigite o valor do saque");
				valor = input.nextInt();
				cont100 = 0;
				cont50 = 0;
				cont20 = 0;
				cont10 = 0;

				while (valor >= 100) {
					valor -= 100;
					cont100++;
				}
				while (valor >= 50) {
					valor -= 50;
					cont50++;
				}
				while (valor >= 20) {
					valor -= 20;
					cont20++;
				}
				while (valor >= 10) {
					valor -= 10;
					cont10++;
				}
				if (valor < 10 && valor > 0) {
					System.out.println("Não temos notas menores que 10!");
				}

				System.out.print("Resultado esperado: ");

				for (int i = 0; i < cont100; i++) {
					System.out.print("R$100,00 ");
				}
				for (int i = 0; i < cont50; i++) {
					System.out.print("R$50,00 ");
				}
				for (int i = 0; i < cont20; i++) {
					System.out.print("R$20,00 ");
				}
				for (int i = 0; i < cont10; i++) {
					System.out.print("R$10,00 ");
				}

			} catch (InputMismatchException e) {
				System.out.println("Por favor, apenas números inteiros!");
			}
		}
		input.close();

	}

}
