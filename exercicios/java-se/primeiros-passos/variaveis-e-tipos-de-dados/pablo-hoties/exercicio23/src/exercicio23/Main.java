package exercicio23;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	double valorGanhadoPorMes;
	double horasTrabalhadasPorMes;
	double salarioLiquido;
	double salarioBruto;
	double inssEFGTS = 8;
	double impostoDeRenda = 11;
	
	System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
	horasTrabalhadasPorMes = ler.nextDouble();
	System.out.print("Digite a quantidade de dinheiro ganhado por hora: ");
	valorGanhadoPorMes = ler.nextDouble();
	salarioLiquido = horasTrabalhadasPorMes * valorGanhadoPorMes;
	salarioBruto = salarioLiquido * inssEFGTS * inssEFGTS * impostoDeRenda / 100;
	
	System.out.println("O salário bruto é: " + salarioBruto);
	System.out.println("O salário líquido é: " + salarioLiquido);
	
	
	
	
	
}
}
