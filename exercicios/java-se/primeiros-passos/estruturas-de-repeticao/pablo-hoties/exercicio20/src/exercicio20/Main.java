package exercicio20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int repeticoes;
		double nota;
		double soma = 0;
		double divisaoEMedia;
		
		System.out.println("Digite quantas notas aritm�ticas ir� existir nesse programa? ");
		repeticoes = ler.nextInt();
		
		for (int i = 0; i < repeticoes; i++) {
			System.out.println("Digite a nota aritm�tica: ");
			nota = ler.nextDouble();
			soma = soma + nota;
		}
		
		ler.close();
		divisaoEMedia = soma / repeticoes;
		
		System.out.println("A m�dia aritm�tica �: " + divisaoEMedia);
	}

}
