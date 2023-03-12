/*
 * Exercicio40.java
 * 
 * 40)Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
 * o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
 * positivo imprimir a sequência de termos: 1, 2, 3, ..., 10, 10, 9, 8, ..., 1. Exemplo com entrada de 20 termos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int qtd, x = 0;

		do {
			System.out.print("Insira a quantidade de termos a ser impresso (somente positivos): ");
			qtd = leia.nextInt();
			if (qtd == 0) {
				System.out.println("Fim!");
			} else {

				for (int i = 1; i <= qtd; i++) {
					if (i <= (qtd / 2)) {
						System.out.print(i + ", ");
						if (i == (qtd / 2)) {
							x = i;
						}
					} else {
						System.out.print(x + ", ");
						x--;
					}
				}
			}
		} while (qtd < 0);
	}
}
