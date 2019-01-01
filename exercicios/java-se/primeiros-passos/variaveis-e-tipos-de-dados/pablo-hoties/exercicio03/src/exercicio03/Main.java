package exercicio03;

public class Main {
	public static void main(String[] args) {
		int valor1 = 26;
		int valor2 = 45;
		float valor3 = 56.03f;
		float valor4 = 23.56f;
		
		System.out.println("Usando o println: ");
		System.out.println("Valor 1: " + valor1);
		System.out.println("Valor 2: " + valor2);
		System.out.println("Valor 3: " + valor3);
		System.out.println("Valor 4: " + valor4);
		System.out.println(" ");
		
		System.out.print("Usando o print: \n");
		System.out.print("Valor 1: " + valor1 + "\n");
		System.out.print("Valor 2: " + valor2 + "\n");
		System.out.print("Valor 3: " + valor3 + "\n");
		System.out.print("Valor 4: " + valor4 + "\n");
		System.out.print(" \n");
		
		System.out.print("Usando o printf: \n");
		System.out.printf("Valor 1: %d  \n", valor1);
		System.out.printf("Valor 2: %d \n", valor2);
		System.out.printf("Valor 3: %.2f \n", valor3);
		System.out.printf("Valor 4: %.2f \n", valor4);
	}
}
