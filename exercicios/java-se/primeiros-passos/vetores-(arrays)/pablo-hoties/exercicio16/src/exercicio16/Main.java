package exercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int inferior = 0;
		int igual = 0;
		int superior = 0;
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um inteiro que estará no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		for (int p = 0; p < vetorA.length; p++) {
			if (vetorA[p] < 15) {
				inferior += vetorA[p];
			} else if (vetorA[p] == 15) {
				igual += vetorA[p];
			} else {
				superior += vetorA[p];
			}
		}
		System.out.println("Exibindo a soma de inteiros que são inferiores a 15: " + inferior);
		System.out.println("Exibindo a soma de inteiros que são iguais a 15: " + igual);
		System.out.println("Exibindo a soma de inteiros que são maiores que 15: " + superior);
	}
}
