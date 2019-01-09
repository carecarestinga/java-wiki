package exercicio11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double salario;
		double salarioComReajuste;
		double porcentagem;
		
		System.out.print("Digite o salário: ");
		salario = ler.nextDouble();
		ler.close();
		
		if (salario <= 280.00) {
			porcentagem = salario * 0.2;
			salarioComReajuste = salario + porcentagem;
			System.out.printf("O novo salário é: %.2f", salarioComReajuste);
		} else if (salario >= 280.01 && salario <= 700.00) {
			porcentagem = salario * 0.15;
			salarioComReajuste = salario + porcentagem;
			System.out.printf("O novo salário é: %.2f", salarioComReajuste);
		} else if (salario >= 700.01 && salario <= 1500.00) {
			porcentagem = salario * 0.1;
			salarioComReajuste = salario + porcentagem;
			System.out.printf("O novo salário é: %.2f", salarioComReajuste);
		} else if (salario > 1500.00) {
			porcentagem = salario * 0.05;
			salarioComReajuste = salario + porcentagem;
			System.out.printf("O novo salário é: %.2f", salarioComReajuste);
		}
		
	}

}
