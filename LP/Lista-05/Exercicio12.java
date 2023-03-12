/*
 * Exercicio12.java
 * 
 * 12) Desenvolva um programa em Java que receba o preço de um produto e seu código de
 * origem e mostre o preço do produto junto de sua procedência, o valor calculado do frete e o
 * valor final a ser pago pelo produto, conforme tabela
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int codigo;
		double preco;

		System.out.print("Insira o codigo do produto: ");
		codigo = leia.nextInt();

		System.out.print("Insira o preco do produto: ");
		preco = leia.nextDouble();

		if (codigo == 1) {
			System.out.println("\nRegiao de procedencia: Norte");
			System.out.println("Frete: " + (preco * 0.1));
			System.out.println("Valor total: " + (preco + (preco * 0.1)));
		} else {
			if (codigo == 2 || codigo == 5 || codigo == 9) {
				System.out.println("\nRegiao de procedencia: Sul");
				System.out.println("Frete: " + (preco * 0.03));
				System.out.println("Valor total: " + (preco + (preco * 0.03)));
			} else {
				if (codigo == 3 || codigo == 10 || codigo == 11 || codigo == 12 || codigo == 13 || codigo == 14
						|| codigo == 15) {
					System.out.println("\nRegiao de procedencia: Leste");
					System.out.println("Frete: " + (preco * 0.012));
					System.out.println("Valor total: " + (preco + (preco * 0.012)));
				} else {
					if (codigo == 7 || codigo == 20) {
						System.out.println("\nRegiao de procedencia: Oeste");
						System.out.println("Frete: " + (preco * 0.073));
						System.out.println("Valor total: " + (preco + (preco * 0.222)));
					} else {
						System.out.println("\nRegiao de procedencia: Importado");
						System.out.println("Frete: " + (preco * 0.073));
						System.out.println("Valor total: " + (preco + (preco * 0.222)));

					}
				}
			}
		}
	}
}
