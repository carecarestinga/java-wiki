package exercicio17;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int contador = 0;
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um inteiro que estará no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		for (int p = 0; p <vetorA.length; p++) {
			if (vetorA[p] > 35) {
				contador += 1;
			}
		}
		System.out.println("Exibindo a quantidade de pessoas digitadas com mais de 35 anos: " + contador);
	}
}
