package exercicio18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero;
		int fatorial = 1;
		
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		
		for (int i = numero; i > 0; i--) {
			fatorial *= i;
			System.out.println(i);
		}
		
		System.out.println(fatorial);
	}
}
