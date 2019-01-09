package exercicio07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int valor3;
		
		System.out.print("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		System.out.print("Digite o terceiro valor: ");
		valor3 = ler.nextInt();
		ler.close();
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor é: " + valor1);
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor é: " + valor2);
		} else  if (valor3 > valor1 && valor3 > valor2) {
			System.out.println("O maior valor é: " + valor3);
		}
		
		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("O menor valor é: " + valor1);
		} else if (valor2 < valor1 && valor2 < valor3) {
			System.out.println("O menor valor é: " + valor2);
		}  else if  (valor3 < valor1 &&  valor3 < valor2) {
			System.out.println("O menor valor é: " + valor3);
		}  
		
	}

}
