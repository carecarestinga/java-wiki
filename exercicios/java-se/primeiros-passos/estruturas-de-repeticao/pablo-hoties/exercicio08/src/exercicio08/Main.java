package exercicio08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero;
		int menor = Integer.MAX_VALUE;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite um número: ");
			numero = ler.nextInt();
			if (numero < menor) {
				menor = numero;
			}
		}
		ler.close();
		System.out.println("O menor número é: " + menor);
	}
}
