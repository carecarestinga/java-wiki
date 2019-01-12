package exercicio12;

import java.util.Scanner;

public class Main {

	private static final double PERCENTUAL_FGTS = 0.11;
	private static final double PERCENTUAL_INSS = 0.10;

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int quantidadeDeHorasTrabalhadasPorMes;
		double valorGanhadoPorHora;
		double salarioBruto;
		double percentualDoImpostoDeRenda;
		
		System.out.print("Digite a quantidade de horas trabalhadas por mês: ");
		quantidadeDeHorasTrabalhadasPorMes = ler.nextInt();
		System.out.print("Digite o quanto ganhas por hora: ");
		valorGanhadoPorHora = ler.nextDouble();
		ler.close();
		
		salarioBruto = valorGanhadoPorHora * quantidadeDeHorasTrabalhadasPorMes;
		
		if (salarioBruto <= 900) {
			percentualDoImpostoDeRenda = 0;
		} else if (salarioBruto >= 901 && salarioBruto <= 1500) {
			percentualDoImpostoDeRenda = 0.05;
		} else if (salarioBruto >= 1501 && salarioBruto <= 2500) {
			percentualDoImpostoDeRenda = 0.1;
		} else {
			percentualDoImpostoDeRenda = 0.2;
		}
		
		double impostoDeRenda = salarioBruto * percentualDoImpostoDeRenda;
		double inss = salarioBruto * PERCENTUAL_INSS;
		double fgts = salarioBruto * PERCENTUAL_FGTS;
		double totalDeDescontos = impostoDeRenda + inss;
		double salarioLiquido = salarioBruto - totalDeDescontos;
		
		System.out.printf("Salário Bruto: (%d * %.2f): R$ %.2f %n", quantidadeDeHorasTrabalhadasPorMes, valorGanhadoPorHora, salarioBruto);
		System.out.printf("(-) IR (%.0f%%) R$ %.2f %n", percentualDoImpostoDeRenda * 100, impostoDeRenda);
		System.out.printf("(-) INSS (%.0f%%) R$ %.2f %n", PERCENTUAL_INSS * 100, inss);
		System.out.printf("FGTS (%.0f%%) R$ %.2f %n", PERCENTUAL_FGTS * 100, fgts);
		System.out.printf("Total de descontos R$ %.2f %n", totalDeDescontos);
		System.out.printf("Salário Líquido R$ %.2f %n", salarioLiquido);
	}
}
