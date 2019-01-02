package exercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double metro;
		double centimetro;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um valor em metros: ");
		metro = ler.nextDouble();
		centimetro  = metro * 100;
		System.out.printf("O resultado em centimetros é: %.0fcm", centimetro);
		
	}

}
