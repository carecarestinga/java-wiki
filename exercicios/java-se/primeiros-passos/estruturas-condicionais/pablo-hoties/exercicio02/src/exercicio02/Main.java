package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int valor;
		
		System.out.print("Digite um valor: ");
		valor = ler.nextInt();
		
		if (valor >= 0) {
			System.out.println("Esse número é positivo!");
		} else {
			System.out.println("Esse número é negativo!");
		}
		
	}

}
