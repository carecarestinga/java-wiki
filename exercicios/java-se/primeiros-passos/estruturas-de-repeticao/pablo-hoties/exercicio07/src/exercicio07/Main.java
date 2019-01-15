package exercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			if (numero > maior) {
				maior = numero;
			}
		}
		ler.close();
		System.out.println("O maior número é: " + maior);
	}
}
