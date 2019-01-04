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
		double operacaoa1;
		double operacaoac1;
		
		System.out.print("Digite o primeiro valor inteiro: ");
		valor1 = ler.nextInt();
		System.out.print("Digite o segundo valor inteiro: ");
		valor2 = ler.nextInt();
		System.out.print("Digite um valor real: ");
		valor3 = ler.nextDouble();
		
		operacaoa1 = valor2 / 2;
		a = valor1 + operacaoa1 * 2;
		operacaoac1 = valor1 * 3;
		b = operacaoac1 + valor3;
		c = Math.pow(valor3, 3);
		
		System.out.println("A)" + a);
		System.out.println("B)" + b);
		System.out.printf("C)%.2f", c);
		
	}

}
