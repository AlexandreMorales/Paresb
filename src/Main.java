import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static int valor = 0;
	private static int limiteDeNotas = 5; 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (valor > -1) {
			try {
				System.out.println("\nDigite o valor do saque");
				valor = input.nextInt();
				if (valor < 10) {
					System.out
							.println("Por favor bote um valor maior que R$ 10");
				} else {

					System.out.print("Resultado esperado: ");
//					contaValor(100);
//					contaValor(50);
//					contaValor(20);
//					contaValor(10);
					contaValorFinito(100);
					contaValorFinito(50);
					contaValorFinito(20);
					contaValorFinito(10);

					if (valor < 10 && valor > 0) {
						System.out
								.println("Não temos notas disponíveis para R$ "
										+ valor);
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

	public static void contaValor(int nota) {
		while (valor >= nota) {
			valor -= nota;
			System.out.print("R$ " + nota + ".00, ");
		}
	}
	public static void contaValorFinito(int nota) {
		int contador = 0;
		while (valor >= nota && contador < limiteDeNotas) {
			valor -= nota;
			contador++;
			System.out.print("R$ " + nota + ".00, ");
		}
	}
}
