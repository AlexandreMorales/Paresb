import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static int valor = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cont100;
		int cont50;
		int cont20;
		int cont10;

		while (valor > -1) {
			try {
				System.out.println("\nDigite o valor do saque");
				valor = input.nextInt();
				if (valor < 10) {
					System.out
							.println("Por favor bote um valor maior que R$ 10");
				} else {
					cont100 = contaValor(100);
					cont50 = contaValor(50);
					cont20 = contaValor(20);
					cont10 = contaValor(10);

					if (valor < 10 && valor > 0) {
						System.out
								.println("Não temos notas disponíveis para R$ "
										+ valor);
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
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, apenas números inteiros!");
				valor = 0;
				input.next();
			}
		}
		input.close();
	}

	public static int contaValor(int nota) {
		int contador = 0;
		while (valor >= nota) {
			valor -= nota;
			contador++;
		}
		return contador;
	}
}
