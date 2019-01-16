package exercicio19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		boolean ePrimo = true;

		System.out.print("Digite um número: ");
		numero = ler.nextInt();

		for (int i = 2; i <= numero; i++) {
			if ((numero % i == 0) && (i != numero)) {
				ePrimo = false;
				break;
			}
		}
		
		ler.close();
		if (ePrimo) {
			System.out.println("Esse número é primo!");
		} else {
			System.out.println("Esse número não é primo!");
		}
	}

}
