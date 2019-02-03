package exercicio19;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		boolean ePrimo = true;

		System.out.print("Digite um n�mero: ");
		numero = ler.nextInt();

		for (int i = 2; i <= numero; i++) {
			if ((numero % i == 0) && (i != numero)) {
				ePrimo = false;
				break;
			}
		}
		
		ler.close();
		if (ePrimo) {
			System.out.println("Esse n�mero � primo!");
		} else {
			System.out.println("Esse n�mero n�o � primo!");
		}
	}

}