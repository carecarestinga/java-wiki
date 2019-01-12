package exercicio20;

import java.util.Scanner;

public class Main {

	private static double precoDoCombustivelEmAlcool = 1.90;
	private static double precoDoCombustivelEmGasolina = 1.50;

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double numeroDeLitrosVendidos;
		String tipoDeCombustivel;
		double desconto = 0;
		double precoDoCombustivelBruto = 0;
		double precoDoCombustivelLiquido = 0;
		
		System.out.print("Digite a quantidade de litros que deseja comprar: ");
		numeroDeLitrosVendidos = ler.nextDouble();
		System.out.print("Digite o tipo de Combustivel que desejas (A - Álcool, G - Gasolina): ");
		tipoDeCombustivel = ler.next();
		
		if (tipoDeCombustivel == "A") {
			precoDoCombustivelBruto = numeroDeLitrosVendidos * precoDoCombustivelEmAlcool;
			if (numeroDeLitrosVendidos <= 20) {
				desconto = 0.03;
			} else {
				desconto = 0.05;
			}
		} else if (tipoDeCombustivel == "G") {
			precoDoCombustivelBruto = numeroDeLitrosVendidos * precoDoCombustivelEmGasolina;
			if (numeroDeLitrosVendidos <= 20) {
				desconto = 0.03;
			} else {
				desconto = 0.06;
			}
		}
		
		precoDoCombustivelLiquido = precoDoCombustivelBruto - desconto;
		System.out.printf("Você deverá pagar %.2f",precoDoCombustivelLiquido);
	}

}
