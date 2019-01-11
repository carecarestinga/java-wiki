package exercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double lado1;
		double lado2;
		double lado3;
		
		System.out.print("Digite o primeiro lado: ");
		lado1 = ler.nextDouble();
		System.out.print("Digite o segundo lado: ");
		lado2 = ler.nextDouble();
		System.out.print("Digite o terceiro lado: ");
		lado3 = ler.nextDouble();
		
		if (lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado3 + lado1 > lado2) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Esse triangulo é equilátero!");
			} else if (lado1 == lado2 && lado2 != lado3) {
				System.out.println("Esse triângulo é isósceles!");
			} else {
				System.out.println("Esse triãngulo é escaleno!");
			}
		} else {
			System.out.println("Me desculpe, mas isso não é um triangulo!");
		}
	}
}
