package exercicio23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler  = new Scanner(System.in);
		
		int quantidade;
		double valorcd;
		double soma = 0;
		double media = 0;
		
		System.out.println("Digite a quantidade de CD's comprados: ");
		quantidade = ler.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Digite o valor do CD " + i + ":");
			valorcd = ler.nextDouble();
			soma = soma + valorcd;
		}
		
		ler.close();
		media = soma / quantidade; 
		
		System.out.println("A média do(s) " + quantidade + "CD(s) é/são: " + media);
	}

}
