/*
 * Exercicio03.java
 * 
 * 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
 * forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
 * compradas, calcule e escreva o custo total da compra
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int quantidade;
		double total;

		System.out.print("Insira o numero de macas compradas: ");
		quantidade = leia.nextInt();

		if (quantidade < 12) {
			total = (quantidade * 1.30);
			System.out.printf("Quantidade de macas: %d\nPreco unitario: R$1,30\nValor total da compra: R$%.2f",
					quantidade, total);
		} else {
			total = (quantidade * 1.00);
			System.out.printf("Quantidade de macas: %d\nPreco unitario: R$1,00\nValor total da compra: R$%.2f",
					quantidade, total);
		}
	}
}
