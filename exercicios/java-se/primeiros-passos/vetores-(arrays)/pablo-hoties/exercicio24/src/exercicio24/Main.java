package exercicio24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int ePalindromo = 1;
		int p = 0;
		int i = 9;
		
		for (int a = 0; p < vetorA.length; p++) {
			System.out.print("Digite um inteiro que estará no indíce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		for (int contador = 0; contador <= 10; contador++) {
			
			if (vetorA[p] != vetorA[i]) {
				ePalindromo = 0;
				contador = 11;
			}
			p++;
			i--;
		}
		
		switch (ePalindromo) {
		case 0:
			System.out.println("Os valores digitados não formam um Palíndromo!");
			break;

		case 1:
			System.out.println("Os valores digitados formam um Palíndromo!");
			break;
		}

		
	}

}
