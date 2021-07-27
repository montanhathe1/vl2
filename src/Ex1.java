import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.print("Digite o primeiro número ou 'x' para sair:"); String
		 * entrada = sc.next();
		 * 
		 * while (!"x".equals(entrada)) {
		 * 
		 * int num1 = Integer.parseInt(entrada);
		 * 
		 * System.out.print("Digite o segundo número: "); int num2 = sc.nextInt();
		 * 
		 * System.out.println("Resultado da soma: " + (num1 + num2));
		 * 
		 * System.out.print("Digite o primeiro número ou 'x' para sair:"); entrada =
		 * sc.next();
		 * 
		 * }
		 */

		while (true) {

			System.out.print("Digite o primeiro número ou 'x' para sair:");
			String entrada = sc.next();

			if ("x" == (entrada)) {
				break;
			}

			int num1 = Integer.parseInt(entrada);

			System.out.print("Digite o segundo número: ");
			int num2 = sc.nextInt();

			System.out.println("Resultado da soma: " + (num1 + num2));

		}

		System.out.println("Fim");
		sc.close();

	}

}
