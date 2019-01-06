package exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		System.out.print("Digite o primeiro valor:");
		valor1 = ler.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("O maior valor é "  + valor1);
		} else {
			System.out.println("O maior valor é :" + valor2);
		}
	}

}
