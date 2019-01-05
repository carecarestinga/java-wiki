package exercicio22;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double altura;
		double pesoIdeal;
		
		System.out.print("Digite uma altura: ");
		altura = ler.nextDouble();
		pesoIdeal = (72.7 * altura) - 58;
		System.out.printf("O peso ideal é: %.2f", pesoIdeal);

	}
}
