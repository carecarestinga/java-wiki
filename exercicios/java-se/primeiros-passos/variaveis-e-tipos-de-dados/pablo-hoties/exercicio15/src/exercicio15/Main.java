package exercicio15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		double lado;
		double area;

		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor de um lado do quadrado: ");
		lado = ler.nextDouble();
		area = Math.pow(lado, 2) ;
		System.out.println("A área do quadrado é: " + area);

	}
}
