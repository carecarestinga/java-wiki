package br.com.debug;

public class Main {

	public static void main(String[] args) {
		Contador contador = new Contador();
		contador.contar();
		System.out.println("Resultado da contagem foi: " + contador.obterResultado());
	}

}