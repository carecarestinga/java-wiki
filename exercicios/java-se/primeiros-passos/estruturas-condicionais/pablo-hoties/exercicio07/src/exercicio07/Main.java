package exercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		int menorvalor = 0;
		int maiorvalor = 0;
		
		System.out.println("Usando esse script você concorda que NÃO IRA REPETIR OS VALORES, muito obrigado :)");
		System.out.print("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		System.out.print("Digite o terceiro valor: ");
		valor3 = ler.nextInt();
		
		if (valor1 < valor2) {
			if (valor1 < valor3) {
				menorvalor = valor1;
			} else {
				menorvalor = valor3;
			}
		} else if (valor3 < valor1) {
			menorvalor = valor3;
		} else { 
			menorvalor = valor2;
		}
		
		if (valor1 > valor2) {
			if (valor1 > valor3) {
				maiorvalor = valor1;
			} else {
				maiorvalor = valor3;
			}
		} else if (valor3 > valor1) {
			maiorvalor = valor3;
		} else {
			maiorvalor = valor2;
		}
		
		System.out.println("O maior valor é: " + maiorvalor + "\nE o menor valor é: " + menorvalor);
		
	}

}
