package exercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int base;
		int expoente;
		
		System.out.print("Qual � a base: ");
		base = ler.nextInt();
		int potencia = base;
		
		System.out.print("Qual � o expoente: ");
		expoente = ler.nextInt();
		
		for (int i = 1;i < expoente;i++) {
			potencia *= base;
		}
		
		System.out.println("A pot�ncia �: " + potencia);
		//2^2 = 2 * 2
		//2^3 = 2 * 2 * 2
	}
}
