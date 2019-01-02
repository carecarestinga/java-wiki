package exercicio14;

import java.util.Scanner;

public class Main {

//	private static final double PI = 3.141591;

	public static void main(String[] args) {

		double raio;
		double circunferencia;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um raio: ");
		raio = ler.nextDouble();
//		circunferencia = 2 * PI * raio;
		circunferencia = 2 * Math.PI * raio;
		System.out.printf("A circunferência é: %.2f", circunferencia);
	}

}
