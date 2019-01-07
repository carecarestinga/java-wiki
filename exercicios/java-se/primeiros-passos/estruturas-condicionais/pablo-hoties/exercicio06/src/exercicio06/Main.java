package exercicio06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		
		System.out.println("Usando esse script você concorda que NÃO IRA REPETIR OS VALORES, muito obrigado :)");
		System.out.print("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		System.out.print("Digite o terceiro valor: ");
		valor3 = ler.nextInt();
		ler.close();
		
		if (valor1 > valor2) {
			if (valor1 > valor3) {
				System.out.println("O primeiro valor é maior do que os outros!");
			} else {
				System.out.println("O terceiro valor é maior do que os outros!");
			}
		}	else if (valor1 == valor2) {
			System.out.println("O terceiro valor é maior do que os outros!");
		} else {
			System.out.println("O segundo valor é maior do que os outros!");
		}
		
		
	}

}
