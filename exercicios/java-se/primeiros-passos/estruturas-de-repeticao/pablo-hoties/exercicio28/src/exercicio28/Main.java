package exercicio28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double quantidade;
		double temperatura = 0;
		double maiorTemperatura = Integer.MIN_VALUE;
		double menorTemperatura = Integer.MAX_VALUE;
		double soma = 0;
		double media;
		
		System.out.print("Digite a quantidade de temperaturas que irá informar: ");
		quantidade = ler.nextDouble();
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.print("Digite a temperatura " + i + " :");
			temperatura = ler.nextDouble();
			soma = soma + temperatura;
			
			if (temperatura > maiorTemperatura) {
				maiorTemperatura = temperatura;
			} if (temperatura < menorTemperatura) {
				menorTemperatura = temperatura;
			}
		}
		ler.close();
		media = soma / quantidade;
		System.out.printf("A maior temperatura é: %.1f%n", maiorTemperatura);
		System.out.printf("A menor temperatura é: %.1f%n", menorTemperatura);
		System.out.printf("A média das temperaturas é: %.1f", media);
	}
}
