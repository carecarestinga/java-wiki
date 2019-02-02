package exercicio04;

public class Main {

	public static void main(String[] args) {

		double populacaoA = 80000;
		double populacaoB = 200000;
		double taxaA = 0.03;
		double taxaB = 0.015;
		int quantidadeAnos = 0;
		
		
		while (populacaoA < populacaoB) {
			populacaoA += populacaoA * taxaA;
			populacaoB += populacaoB * taxaB;
			quantidadeAnos++;
		}
		
		System.out.println("População A: " + populacaoA);
		System.out.println("População B:" + populacaoB);
		System.out.println("Anos:" + quantidadeAnos);
	}
}
