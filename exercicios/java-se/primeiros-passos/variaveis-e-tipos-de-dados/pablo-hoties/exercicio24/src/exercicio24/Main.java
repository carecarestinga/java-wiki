package exercicio24;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String nome;
		double salarioFixo;
		double salarioFinal;
		double vendasNoMes;
		double comissao = 15;
		
		System.out.print("Diga o nome do vendedor: ");
		nome = ler.next();
		System.out.print("Digite o salário fixo: ");
		salarioFixo = ler.nextDouble();
		System.out.print("Diga o total de vendas efetuadas no mês (em dinheiro): ");
		vendasNoMes = ler.nextDouble();
		salarioFinal = salarioFixo + vendasNoMes * comissao / 100;
		
		System.out.print("O vendedor "+ nome + " teve o salário fixo: ");
		System.out.printf("%.2f", salarioFixo);
		System.out.print("  e o salário final: ");
		System.out.printf("%.2f", salarioFinal);
		
		
		
		
	}

}
