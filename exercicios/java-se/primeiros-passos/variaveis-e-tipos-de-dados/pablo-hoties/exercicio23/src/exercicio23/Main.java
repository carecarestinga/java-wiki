package exercicio23;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double valorGanhadoPorMes;
		double horasTrabalhadasPorMes;
		double salarioLiquido;
		double salarioBruto;
		double descontoINSS;
		double descontoFGTS;
		double descontoImpostoDeRenda;

		System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
		horasTrabalhadasPorMes = ler.nextDouble();
		System.out.print("Digite a quantidade de dinheiro ganhado por hora: ");
		valorGanhadoPorMes = ler.nextDouble();
		salarioBruto = horasTrabalhadasPorMes * valorGanhadoPorMes;
		descontoINSS = salarioBruto * 0.08;
		descontoFGTS = salarioBruto * 0.08;
		descontoImpostoDeRenda = salarioBruto * 0.11;
		salarioLiquido = salarioBruto - (descontoFGTS + descontoImpostoDeRenda + descontoINSS);
		
		System.out.printf("O salário bruto é: %.2f\n", salarioBruto);
		System.out.printf("O desconto do INSS é : %.2f\n", descontoINSS);
		System.out.printf("O desconto do FGTS é : %.2f\n", descontoFGTS);
		System.out.printf("O desconto do Imposto De Renda é: %.2f\n", descontoImpostoDeRenda);
		System.out.printf("O salário líquido é: %.2f", salarioLiquido);

	}
}
