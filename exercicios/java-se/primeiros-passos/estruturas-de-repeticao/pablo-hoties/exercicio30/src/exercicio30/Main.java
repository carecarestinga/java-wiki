package exercicio30;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		boolean primo;
		
		System.out.print("Digite um número: ");
		int numero = ler.nextInt();

		for (int i = 2; i < numero; i++) {
			primo = true;
			
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}
			
			if (primo) {
				System.out.println(i);
			}
		}
	}
}
