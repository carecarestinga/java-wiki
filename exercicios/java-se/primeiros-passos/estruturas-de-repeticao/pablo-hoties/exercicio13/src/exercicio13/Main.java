package exercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int numero;
		int resultado;
		
		System.out.print("Digite um número para saber a tabuada do número digitado: ");
		numero = ler.nextInt();
		ler.close();
		
		for (int i = 0; i <= 10; i++) {
			resultado = numero * i;
			System.out.printf("%d x %d = %d%n", numero, i, resultado);
		}
		s
	}

}
