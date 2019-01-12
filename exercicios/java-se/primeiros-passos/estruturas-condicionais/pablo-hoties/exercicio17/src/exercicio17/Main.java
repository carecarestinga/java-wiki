package exercicio17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = ler.nextInt();

		System.out.println(numero % 2 == 0 ? "Esse número é par" : "Esse número é impar");
		
//		if (numero % 2 == 0) {
//			System.out.println("Esse número é par!");
//		} else {
//			System.out.println("Esse número é impar!");
//		}
		
	}

}
