package exercicio21;

import java.util.Scanner;

public class Main {

	private static double precoDosMorangos;
	private static double precoDasMacas;

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String tipoDeFrutas;
		double quantidadeDeFrutasCompradas;
		double porcentagemDoDesconto = 0;
		double desconto;
		double precoBruto = 0;
		double precoLiquido;
		String fruta = "fruta";
		
		System.out.print("Digite a quantidade de frutas compradas: ");
		quantidadeDeFrutasCompradas = ler.nextDouble();
		System.out.print("Digite qual é a fruta comprada (MO - Morango e MA - Maçã):");
		tipoDeFrutas = ler.next();
		
		if(tipoDeFrutas.equalsIgnoreCase("MO")) {
			if (quantidadeDeFrutasCompradas <= 5) {
				precoDosMorangos = 2.50;
			} else {
				precoDosMorangos = 2.20;
			}
			precoBruto = quantidadeDeFrutasCompradas * precoDosMorangos;
			fruta = "Morangos";
		} else if (tipoDeFrutas.equalsIgnoreCase("MA")) {
			if (quantidadeDeFrutasCompradas <= 5) {
				precoDasMacas = 1.80;
			} else {
				precoDasMacas = 1.50;
			}
			precoBruto = quantidadeDeFrutasCompradas * precoDasMacas;
			fruta = "Maças";
		}
		
		if (quantidadeDeFrutasCompradas > 8 || precoBruto >= 25.00) {
			porcentagemDoDesconto = 0.10;
		}
		
		desconto = porcentagemDoDesconto * precoBruto;
		precoLiquido = precoBruto - desconto;
		
		System.out.printf("Quantidade de %s compradas: %.0fKg%n", fruta, quantidadeDeFrutasCompradas);
		System.out.printf("Valor a ser pago: %.2f", precoLiquido);
		
	}

}
