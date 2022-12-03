/*
 * Exercicio39.java
 * 
 * 39)Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
 * o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
 * positivo imprimir a sequência de termos: 1/50 + 2/49, 3/48 + ... + 50/1. Exemplo com entrada de 50 termos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int qtd, x;

		do {
			System.out.print("Insira a quantidade de termos a ser impresso (somente positivos): ");
			qtd = leia.nextInt();
			x = qtd;
			if (qtd == 0) {
				System.out.println("Fim!");
			} else {
				for (int i = 1; i <= qtd; i++) {
					System.out.print(i + "/" + (x--) + " + ");
				}
			}
		} while (qtd < 0);
	}
}
