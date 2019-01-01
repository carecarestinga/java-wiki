package exercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numero1;
		int numero2;
		int soma;
		int subtracao;
		int divisao;
		int multiplicacao;
		
		
		
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero1 = leia.nextInt();
		System.out.print("Digite um outro número inteiro: ");
		numero2 = leia.nextInt();
		
		soma = numero1 + numero2;
		subtracao = numero1 - numero2;
		divisao = numero1 / numero2;
		multiplicacao = numero1 * numero2;
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Multiplicação: " + multiplicacao);
		
		
		
		
		
		
		
	}

}
