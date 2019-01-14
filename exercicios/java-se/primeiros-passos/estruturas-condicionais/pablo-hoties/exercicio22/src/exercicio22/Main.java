package exercicio22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double quantidadeDeCarneCompradas;
		String tipoDaCarne;
		double precoDaCarne = 0;
		double precoBruto;
		double precoLiquido;
		String cartaoTabajara;
		double porcentagemDoDesconto = 0;
		double desconto = 0;
		String tipoDePagamento;
		
		System.out.println("Opções De Carne: \nFile Duplo\n Alcatra\n Picanha");
		System.out.print("Digite o tipo de carne comprada: ");
		tipoDaCarne = ler.nextLine();
		System.out.print("Digite a quantidade de carne comprada: ");
		quantidadeDeCarneCompradas = ler.nextDouble();
		System.out.println("Você irá comprar usando o cartão Tabajara? (Responda com sim ou não):  ");
		cartaoTabajara = ler.next();

		if (tipoDaCarne.equalsIgnoreCase("File Duplo")) {
			if (quantidadeDeCarneCompradas <= 5) {
				precoDaCarne = 4.90;
			} else {
				precoDaCarne = 5.80;
			}
		} else if (tipoDaCarne.equalsIgnoreCase("Alcatra")) {
			if (quantidadeDeCarneCompradas <= 5) {
				precoDaCarne = 5.90;
			} else {
				precoDaCarne = 6.80;
			}
		} else if (tipoDaCarne.equalsIgnoreCase("Picanha")) {
			if (quantidadeDeCarneCompradas <= 5) {
				precoDaCarne = 6.90;
			} else {
				precoDaCarne = 7.80;
			}
		}
		
		precoBruto = quantidadeDeCarneCompradas * precoDaCarne;
		
		if (cartaoTabajara.equalsIgnoreCase("Sim")) {
			porcentagemDoDesconto = 0.05;
			desconto = precoBruto * porcentagemDoDesconto;
			tipoDePagamento = "Cartão Tabajara";
		} else {
			tipoDePagamento = "Dinheiro";
		}
		
		precoLiquido = precoBruto - desconto;
		
		
		System.out.printf("Tipo da carne: %s%n", tipoDaCarne);
		System.out.printf("Quantidade da carne: %.0f%n", quantidadeDeCarneCompradas);
		System.out.printf("Preço total: %.2f%n", precoBruto);
		System.out.printf("Tipo de pagamento: %s%n", tipoDePagamento);
		System.out.printf("Valor do desconto: %.0f%%%n", porcentagemDoDesconto * 100);
		System.out.printf("Valor a pagar: %.2f", precoLiquido);
		
	}

}
