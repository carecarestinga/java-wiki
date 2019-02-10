package exercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA  = new int[10];
		int contador = 0;
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um número inteiro que estará no vetorA e no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		System.out.println("");
		for (int p = 0; p < vetorA.length; p++) {
			if (vetorA[p] % 2 == 0) {
				contador++;
			}
		}
		System.out.println("A quantidade de números pares digitados foi/foram: " + contador);
	}
}
