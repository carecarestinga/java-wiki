package exercicio08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite a primeira nota bimestral: ");
		nota1  = leia.nextFloat();
		System.out.print("Digite a segunda nota bimestral: ");
		nota2 = leia.nextFloat();
		System.out.print("Digite a terceira nota bimestral: ");
		nota3 = leia.nextFloat();
		System.out.print("Digite a quarta nota bimestral: ");
		nota4 = leia.nextFloat();
		media = nota1 + nota2 + nota3 + nota4;
		media = media / 4;
		System.out.println("A média é: " + media);
		
		
		
	}

}
