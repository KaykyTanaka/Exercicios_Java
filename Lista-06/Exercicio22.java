/*
 * Exercicio22.java
 * 
 * 22) Escreva um programa em Java para ler o código e o preço de 15 produtos, calcular e escrever:
 * - o maior preço lido;
 * - a média aritmética dos preços dos produtos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int quantidade = 0;
		double maior = 0;
		double preco, total = 0;

		do {
			System.out.print("Digite o preco do produto: R$");
			preco = leia.nextInt();

			if (preco > maior) {
				maior = preco;
			}

			total += preco;
			quantidade++;
		} while (quantidade < 15);

		System.out.print("O maior preco lido foi: R$" + maior);
		System.out.print("\nA media dos precos dos produtos e: R$" + (total / 15));
	}
}
