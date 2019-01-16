package exercicio03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		validarNome(ler);
		validarIdade(ler);
		validarSalario(ler);
		validarSexo(ler);
		validarEstadoCivil(ler);

	}

	private static void validarEstadoCivil(Scanner ler) {
		String estadoCivil;

		System.out.print("Digite seu estado civil: ");
		estadoCivil = ler.next();

		while (!estadoCivil.equalsIgnoreCase("s") && !estadoCivil.equalsIgnoreCase("c")
				&& !estadoCivil.equalsIgnoreCase("v") && !estadoCivil.equalsIgnoreCase("d")) {
			System.out.println("Você digitou incorretamente, tente novamente!");
			System.out.print("Digite seu estado civil: ");
			estadoCivil = ler.next();

		}

		System.out.println("Você digitou corretamente, você digitou: " + estadoCivil);

	}

	private static void validarSexo(Scanner ler) {
		char sexo;

		System.out.print("Digite um sexo: ");
		sexo = ler.next().charAt(0);
		sexo = Character.toLowerCase(sexo);

		while (sexo != 'f' && sexo != 'm') {
			System.out.print("Digite um sexo: ");

			sexo = ler.next().charAt(0);
			sexo = Character.toLowerCase(sexo);
		}

		System.out.println("Você digitou corretamente, você digitou: " + sexo);
	}

	private static void validarSalario(Scanner ler) {
		double salario;

		System.out.print("Digite o salário: ");
		salario = ler.nextDouble();

		while (salario <= 0) {
			System.out.println("Você não digitou um salário, tente novamente!");
			System.out.print("Digite o salário: ");
			salario = ler.nextDouble();
		}

		System.out.println("Parabéns você está ganhando dinheiro!");

	}

	private static void validarIdade(Scanner ler) {
		int idade;

		do {
			System.out.print("Digite uma idade entre 0 e 150: ");
			idade = ler.nextInt();
		} while (idade < 0 || idade > 150);

		System.out.println("A idade está entre 0 e 150, a idade é: " + idade);
		System.out.println();

	}

	private static void validarNome(Scanner ler) {
		String nome;

		System.out.print("Digite um nome com mais de 3 caracteres: ");
		nome = ler.next();

		while (nome.length() <= 3) {
			System.out.println("ATENÇÃO, o nome precisa ter mais que 3 caracteres: ");
			nome = ler.next();
		}

		System.out.println("Você digitou com mais de 3 caracteres, o nome é: " + nome);
		System.out.println();
	}

}
