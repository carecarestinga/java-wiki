package exercicio31;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
	
		int tabuada, inicio, fim,resultado;
		
		System.out.println("Mostrar tabuada de: ");
		tabuada = ler.nextInt();
		System.out.println("A tabuade de " + tabuada + " vai começar com: ");
		inicio = ler.nextInt();
		System.out.println("A tabuada de " + tabuada + " vai acabar em: ");
		fim = ler.nextInt();
		ler.close();
	
		for (int i = inicio;inicio <= fim; inicio++) {
			resultado = tabuada * inicio;
			System.out.println(tabuada + " X " + inicio + " = " + resultado);
		}
	}
}