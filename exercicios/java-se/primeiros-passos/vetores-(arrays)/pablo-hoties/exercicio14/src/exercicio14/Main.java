package exercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int soma = 0, contador = 0;
		double media;
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um n�mero �mpar inteiro que estar� no vetorA e no ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
			if (vetorA[p] % 2 != 0) {
				soma+= vetorA[p];
				contador++;
			}
		}
		ler.close();
		media = soma / contador;
		System.out.println("\nA m�dia Aritm�tica �: " + media);
	}
}
