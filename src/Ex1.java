/*
	Calculadora que some dois números
	
	1. Aplicação roda no terminal
	2. O resultado deverá ser exibido logo após o comando de execução do cálculo
	3. Todas operações, bem como seus resultados deverão ser guardados em um a lista
	4. Ao entrar na aplicação ela solicita os dois números para somar
	5. Apos mostrar os resultado, a aplicação retorno ao estado inicial
	6. A aplicação é encerrada digitando x como primeiro número
	7. Antes de sair a aplicação exibir a lista de operação
	
	Desenvolvimento:
	Tempo de execução máximo: 28/07 às 9h 
*/




import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		 System.out.print("Digite o primeiro número ou 'x' para sair: "); 
		 String entrada = sc.next();
		  
		 while (!"x".equals(entrada)) {
		  
			 int num1 = Integer.parseInt(entrada);
		  
			 System.out.print("Digite o segundo número: "); 
			 int num2 = sc.nextInt();
		 
			 System.out.println("Resultado da soma: " + (num1 + num2));
		  
			 System.out.print("Digite o primeiro número ou 'x' para sair:"); 
			 entrada = sc.next();
		  
		 }

		 System.out.println("Fim");
		 sc.close();
		 

//		while (true) {
//
//			System.out.print("Digite o primeiro número ou 'x' para sair:");
//			String entrada = sc.next();
//
//			if ("x" == (entrada)) {
//				break;
//			}
//
//			int num1 = Integer.parseInt(entrada);
//
//			System.out.print("Digite o segundo número: ");
//			int num2 = sc.nextInt();
//
//			System.out.println("Resultado da soma: " + (num1 + num2));
//
//		}
//
//		System.out.println("Fim");
//		sc.close();

	}

}
