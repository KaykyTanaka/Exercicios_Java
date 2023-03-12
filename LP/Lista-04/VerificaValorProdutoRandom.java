/*
 * VerificaValorProdutoRandom.java
 * 
 * 3 - Crie um arquivo chamado VerificaValorProdutoRandom.java. Gere dois números aleatórios
 * entre 1 e 1000 (inclusos), atribuindo as variáveis precoProduto1 e precoProduto2. O programa deve
 * exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
 * Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
 * deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
 * exibida.
 * 
 * 
 */
import java.lang.Math;

public class VerificaValorProdutoRandom {

	public static void main(String[] args) {
		double precoProduto1 = (Math.random() * 1000) + 1;
		double precoProduto2 = (Math.random() * 1000) + 1;

		System.out.printf("Produto 1 = R$%.2f\nProduto 2 = R$%.2f\n", precoProduto1, precoProduto2);

		if (precoProduto1 == precoProduto2) {
			System.out.println("Os preços dos dois produtos são iguais");
		} else {
			if (precoProduto1 > precoProduto2) {
				System.out.println("O produto 2 é o mais barato!");
			} else {
				System.out.println("O produto 1 é o mais barato!");
			}
		}
	}
}