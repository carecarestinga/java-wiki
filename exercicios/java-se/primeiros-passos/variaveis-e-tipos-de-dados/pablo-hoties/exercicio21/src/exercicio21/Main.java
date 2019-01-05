package exercicio21;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int valor1;
		int valor2;
		double valor3;
		double a;
		double b;
		double c;
		
		System.out.print("Digite o primeiro valor inteiro: ");
		valor1 = ler.nextInt();
		System.out.print("Digite o segundo valor inteiro: ");
		valor2 = ler.nextInt();
		System.out.print("Digite um valor real: ");
		valor3 = ler.nextDouble();
		
		a = (valor1 * 2) * (valor2 / 2);
		b = (valor1 * 3) + valor3;
		c = Math.pow(valor3, 3);
		
		System.out.println("A) " + a);
		System.out.println("B) " + b);
		System.out.printf("C) %.2f", c);
		
	}

}
