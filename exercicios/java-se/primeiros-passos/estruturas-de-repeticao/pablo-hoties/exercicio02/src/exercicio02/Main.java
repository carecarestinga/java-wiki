package exercicio02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String usuario;
		String senha;
		
		System.out.println("Digite o nome de usuario: ");
		usuario = ler.next();
		System.out.println("Digite a senha: ");
		senha = ler.next();
		
		while (usuario.equalsIgnoreCase(senha)) {
			System.out.println("Você não pode definir a sua senha com o nome de usuario!");
			System.out.println("Digite o nome de usuario: ");
			usuario = ler.next();
			System.out.println("Digite a senha: ");
			senha = ler.next();
		}
		System.out.println("Parabéns, sua senha foi criado com sucesso!");
	}
}
