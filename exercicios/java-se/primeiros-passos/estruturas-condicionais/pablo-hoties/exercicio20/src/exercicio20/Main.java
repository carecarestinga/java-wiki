package exercicio20;

import java.util.Scanner;

public class Main {

	private static final double PRECO_DO_COMBUSTIVEL_EM_GASOLINA = 1.50;
	private final static double PRECO_DO_COMBUSTIVEL_EM_ALCOOL = 1.90;

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double numeroDeLitrosVendidos;
		String tipoDeCombustivel;
		double porcentagemDoDesconto = 0;
		double desconto;
		double precoDoCombustivelBruto = 0;
		double precoDoCombustivelLiquido = 0;
		
		System.out.print("Digite a quantidade de litros que deseja comprar: ");
		numeroDeLitrosVendidos = ler.nextDouble();
		System.out.print("Digite o tipo de Combustivel que desejas (A - Álcool, G - Gasolina): ");
		tipoDeCombustivel = ler.next();
		
		if (tipoDeCombustivel.equalsIgnoreCase("A")) {
			precoDoCombustivelBruto = numeroDeLitrosVendidos * PRECO_DO_COMBUSTIVEL_EM_ALCOOL;
			if (numeroDeLitrosVendidos <= 20) {
				porcentagemDoDesconto = 0.03;
			} else {
				porcentagemDoDesconto = 0.05;
			}
		} else if (tipoDeCombustivel.equalsIgnoreCase("G")) {
			precoDoCombustivelBruto = numeroDeLitrosVendidos * PRECO_DO_COMBUSTIVEL_EM_GASOLINA;
			if (numeroDeLitrosVendidos <= 20) {
				porcentagemDoDesconto = 0.03;
			} else {
				porcentagemDoDesconto = 0.06;
			}
		}
		
		desconto = precoDoCombustivelBruto * porcentagemDoDesconto;
		precoDoCombustivelLiquido = precoDoCombustivelBruto - desconto;
		System.out.printf("Número de litros vendidos: %.0f%n", numeroDeLitrosVendidos);
		System.out.printf("Tipo de combustível: %s%n", tipoDeCombustivel);
		System.out.printf("Valor a ser pago: %.2f%n", precoDoCombustivelLiquido);
		
	}
	
}
