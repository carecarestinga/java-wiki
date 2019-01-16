package exercicio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma = 0;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = ler.nextInt();
		ler.close();
		
		if (numero1 < numero2) {
			for (int i = numero1; i <= numero2; i++) {
				soma += i;
				System.out.println(i + "\n");
			}
			System.out.println("A soma é: " + soma);
		} else if (numero1 > numero2) {
			for (int i = numero2; i <= numero1; i++) {
				soma += i;
				System.out.println(i + "\n");
			}
			System.out.println("A soma é: " + soma);
		} else {
			System.out.println(numero1);
			System.out.println("A soma é: " + (numero1 + numero2));
		}
	}

}
