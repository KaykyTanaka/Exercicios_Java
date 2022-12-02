/*
 * Kayky Tanaka de Abreu
 * 
 * VerificaValorProduto.java
 * 
 * 4 - Crie um arquivo chamado VerificaValorProduto.java. Solicite ao usuário que digite os valores
 * para as variáveis precoProduto1 e precoProduto2. O programa deve testar o valor digitado pelo
 * usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos), exibir a
 * mensagem VALOR INVALIDO e finalizer o programa. Caso os valores digitados sejam válidos,
 * exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
 * Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
 * deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
 * exibida.
 * 
 * 
 */
import java.util.Scanner;

public class VerificaValorProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double precoProduto1, precoProduto2;

		System.out.print("Digite o valor do Produto 1: ");
		precoProduto1 = leia.nextDouble();

		System.out.print("Digite o valor do Produto 2: ");
		precoProduto2 = leia.nextDouble();

		if (precoProduto1 > 1000 || precoProduto1 < 1 || precoProduto2 > 1000 || precoProduto2 < 1) {
			System.out.println("VALOR INVALIDO");
		} else {
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
}