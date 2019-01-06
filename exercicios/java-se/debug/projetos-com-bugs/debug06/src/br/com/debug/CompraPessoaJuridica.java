package br.com.debug;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.com.debug.modelo.CarrinhoCompra;
import br.com.debug.modelo.Categoria;
import br.com.debug.modelo.FormaPagamento;
import br.com.debug.modelo.Produto;

public class CompraPessoaJuridica {
	
	public static void main(String[] args) {
		Categoria perfumaria = new Categoria("Perfumaria");
		List<Produto> produtos = criarProdutos(perfumaria);
		CarrinhoCompra carrinho = new CarrinhoCompra(FormaPagamento.CARTAO_CREDITO);
		BigDecimal valorFinalDaCompra = carrinho.calcularPrecoFinal(produtos);
		System.out.printf("Valor da compra: %.2f", valorFinalDaCompra);
	}

	private static List<Produto> criarProdutos(Categoria categoria) {
		
		//5 Mulheres na equipe
		Produto _212 = new Produto("212 Sexy Feminino",new BigDecimal(("179.99")), categoria, 5);

		//2 Diretoras na equipe
		Produto chanel = new Produto("Chanel Nยบ5 ", new BigDecimal("665"), categoria, 2);
		
		//7 Homens da equipe
		Produto sauvage = new Produto("Sauvage", new BigDecimal("375"), categoria, 7);
		
		return  Arrays.asList(_212, chanel, sauvage);
	}
	
}