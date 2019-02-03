package exercicio29;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		boolean sair = false;
		int codigo, quantidade;
		double valorTotalDosProdutos = 0;
		String saida = "";
		
		System.out.println("Primeiramente veja o menu: \n");
		System.out.println("Especificação   Código  Preço");
		System.out.println("Cachorro Quente 100     R$ 1,20");
		System.out.println("Bauru Simples   101     R$ 1,30");
		System.out.println("Bauru com ovo   102     R$ 1,50");
		System.out.println("Hambúrguer      103     R$ 1,20");
		System.out.println("Cheeseburguer   104     R$ 1,30");
		System.out.println("Refrigerante    105     R$ 1,00\n");
		
		do {
			System.out.println("Digite o código do produto e a quantidade: ");
			codigo = ler.nextInt();
			quantidade = ler.nextInt();
			
			if (codigo == 0 && quantidade == 0) {
				sair = true;
			} else if (codigo == 100) {
				saida += "Cachorro Quente -> 1,20 X " + quantidade;
				saida += " = " + (1.20 * quantidade + "\n");
				valorTotalDosProdutos += 1.20 * quantidade;
			} else if (codigo == 101) {
				saida += "Bauru Simples -> 1,30 X " + quantidade;
				saida += " = " + (1.30 * quantidade + "\n");
				valorTotalDosProdutos += 1.30 * quantidade;
			} else if (codigo == 102) {
				saida += "Bauru com ovo -> 1,50 X " + quantidade;
				saida += " = " + (1.50 * quantidade + "\n");
				valorTotalDosProdutos += 1.50 * quantidade;
			} else if (codigo == 103) {
				saida += "Hambúrguer -> 1,20 X " + quantidade;
				saida += " = " + (1.20 * quantidade + "\n");
				valorTotalDosProdutos += 1.20 * quantidade;
			} else if (codigo == 104) {
				saida += "Cheeseburguer -> 1,30 X " + quantidade;
				saida += " = " + (1.30 * quantidade + "\n");
				valorTotalDosProdutos += 1.30 * quantidade;
			} else if (codigo == 105) {
				saida += "Refrigerante -> 1,00 X " + quantidade;
				saida += " = " + (1.00 * quantidade + "\n");
				valorTotalDosProdutos += 1.30 * quantidade;
			}
			
		} while (!sair);
		
		System.out.println(saida);
		System.out.println("O valor total é: " + valorTotalDosProdutos);
	}
}