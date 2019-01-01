package exercicio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int valor;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		valor = leia.nextInt();
		valor = valor * 3;
		System.out.println("O triplo desse número é: " + valor);
		
	}

}
