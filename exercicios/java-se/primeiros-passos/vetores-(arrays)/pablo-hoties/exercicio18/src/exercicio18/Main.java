package exercicio18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int menorNumero = Integer.MAX_VALUE;
		int indiceMenor = 0;
		int maiorNumero = Integer.MIN_VALUE;
		int indiceMaior = 0;
		
		for (int p = 0; p < vetorA.length; p++) {
			System.out.print("Digite um inteiro que estar� no ind�ce " + p + " : ");
			vetorA[p] = ler.nextInt();
		}
		ler.close();
		for (int p = 0; p < vetorA.length; p++) {
			if (vetorA[p] < menorNumero) {
				menorNumero = vetorA[p];
				indiceMenor = p;
			}
			if (vetorA[p] > maiorNumero) {
				maiorNumero = vetorA[p];
				indiceMaior = p;
			}
		}
		System.out.printf("Exibindo o menor n�mero e seu respectivo ind�ce: %d, %d", menorNumero, indiceMenor);
		System.out.printf("%nExibindo o maior n�mero e seu respectivo ind�ce: %d, %d", maiorNumero, indiceMaior);
	}
}
