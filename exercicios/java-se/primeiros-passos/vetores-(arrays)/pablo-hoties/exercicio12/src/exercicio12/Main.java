package exercicio12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0;
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um número inteiro que estará no vetor A e no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		for (int p = 0; p <vetorA.length; p++) {
			soma += vetorA[p];
		}
		System.out.println("\nExibindo a soma de todos os números digitados do vetorA : " + soma);
	}
}
