package exercicio09;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = ler.nextInt();
		System.out.print("Digite  o terceiro número: ");
		numero3 = ler.nextInt();
		ler.close();

		// num1 < num2 < num3
		if (numero1 < numero2 && numero1 < numero3 && numero2 < numero3) {
			System.out.printf("Ordem decrescente: %d %d %d %n", numero3, numero2, numero1);
		}
		
		// num1 < num3 < num2
		if (numero1 < numero3 && numero1 < numero2 && numero3 < numero2) {
			System.out.printf("Ordem decrescente: %d %d %d %n", numero2, numero3, numero1);
		}
		
		// num2 < num1 < num3
		if (numero2 < numero1 && numero2 < numero3 && numero1 < numero3) {
			System.out.printf("Ordem decrescente: %d %d %d %n", numero3, numero1, numero2);
		}
		
		// num2 < num3 < num1
		if (numero2 < numero3 && numero2 < numero1 && numero3 < numero1) {
			System.out.printf("Ordem decrescente: %d %d %d %n", numero1, numero3, numero2);
		}
		
		// num3 < num1 < num2
		if (numero3 < numero1 && numero3 < numero2 && numero1 < numero2) {
			System.out.printf("Ordem decrescente: %d %d %d %n", numero2, numero1, numero3);
		}
		// num3 < num2 < num1
		if (numero3 < numero2 && numero3 < numero1 && numero2 < numero1) {
			System.out.printf("Ordem decrescente: %d %d %n", numero1, numero2, numero3);
		}
		
	}

}
