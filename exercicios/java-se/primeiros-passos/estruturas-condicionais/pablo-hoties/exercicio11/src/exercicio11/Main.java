package exercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double salario;
		double porcentagem = 0;
		double valorDoAumento;
		double salarioComReajuste = 0;
		
		System.out.print("Digite o salário: ");
		salario = ler.nextDouble();
		ler.close();
		
		if (salario <= 280.00) {
			porcentagem = 0.2;
		} else if (salario >= 280.01 && salario <= 700.00) {
			porcentagem = 0.15;
		} else if (salario >= 700.01 && salario <= 1500.00) {
			porcentagem = 0.1;
		} else if (salario > 1500.00) {
			porcentagem = 0.05;
		}
		
		valorDoAumento = salario * porcentagem;
		salarioComReajuste = salario + valorDoAumento;
		
		System.out.printf("O salário antes do reajuste era: %.2f", salario);
		System.out.printf(" e o percentual do aumento aplicado é %.0f%%", porcentagem * 100);
		System.out.printf(" e o valor do aumento é: %.2f", valorDoAumento);
		System.out.printf(" e o novo salário é: %.2f", salarioComReajuste);
		
	}

}
