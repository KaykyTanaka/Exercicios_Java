/*
 * Exercicio33.java
 * 
 * 33)Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
 * o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
 * positivo imprimir a sequência de termos:1, 3, 5, 7, ...
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int qtd;

		do {
			System.out.print("Insira a quantidade de termos a ser impresso (somente positivos): ");
			qtd = leia.nextInt();

			if (qtd == 0) {
				System.out.println("Fim!");
			} else {
				for (int i = 0; i <= qtd; i++) {
					if (i % 2 != 0) {
						System.out.print(i + ", ");
					}
				}
			}
		} while (qtd < 0);
	}
}
