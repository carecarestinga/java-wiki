package exercicio20;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int repeticoes;
		double nota;
		double soma = 0;
		double media;
		
		System.out.println("Digite quantas notas aritméticas irá existir nesse programa? ");
		repeticoes = ler.nextInt();
		
		for (int i = 0; i < repeticoes; i++) {
			System.out.println("Digite a nota aritmética: ");
			nota = ler.nextDouble();
			soma = soma + nota;
		}
		
		ler.close();
		media = soma / repeticoes;
		
		System.out.println("A média aritmética é: " + media);
	}

}
