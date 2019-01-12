package exercicio18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double numero1;
		double numero2;
		int operacao;
		double resultado = 0;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = ler.nextInt();
		System.out.println("Qual operação deseja? ( 1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão)");
		operacao = ler.nextInt();
		
		switch (operacao) {
			case 1:
				resultado = numero1 + numero2;
				break;
			
			case 2:
				resultado  = numero1 - numero2;
				break;
				
			case 3:
				resultado = numero1 * numero2;
				break;
				
			case 4:
				resultado = numero1 / numero2;
				break;
		}

		if (resultado % 2 == 0) {
			System.out.println("O resultado é par!");
		} else {
			System.out.println("O resultado é impar!");
		}
		
		if (resultado < 0) {
			System.out.println("O resultado é negativo!");
		} else if (resultado > 0) {
			System.out.println("O resultado é positivo!");
		} else {
			System.out.println("O resultado é neutro!");
		}
	}
}
