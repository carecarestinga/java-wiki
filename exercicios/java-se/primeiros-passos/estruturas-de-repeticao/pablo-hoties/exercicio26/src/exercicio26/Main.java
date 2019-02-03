package exercicio26;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double produtos = 0;
		boolean sair = false;
		int contador = 1;
		double dinheiroDoUsuario;
		double totalDosProdutos = 0;
		double troco;
		
		do {
			System.out.print("Digite o valor do produto " + contador + " : ");
			produtos = ler.nextDouble();
			totalDosProdutos += produtos;
			
			if (produtos == 0) {
				sair = true;
			}
			contador++;
		} while (!sair);
		
		System.out.printf("O valor dos produtos comprados: %.2f%n", totalDosProdutos);
		System.out.print("Digite o dinheiro que irá entregar: ");
		dinheiroDoUsuario = ler.nextDouble();
		ler.close();
		troco = dinheiroDoUsuario - totalDosProdutos;
		System.out.printf("O o troco é: %.2f", troco);
	}
}