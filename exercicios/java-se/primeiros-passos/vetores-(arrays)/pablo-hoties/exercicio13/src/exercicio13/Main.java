package exercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um número que estará no vetorA e no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
			if (vetorA[p] % 5 == 0) {
				soma += vetorA[p];
			}
		}
		ler.close();
		System.out.println("Exibindo a soma de todos os múltiplos de 5: " + soma);
	}
}
