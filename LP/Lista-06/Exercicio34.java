/*
 * Exercicio34.java
 * 
 * 34)Escreva um programa que solicite ao usuário a quantidade de termos, validando a entrada, sendo
 * o valor negativo, solicitar nova entrada, sendo o valor ZERO, finalizar o programa, caso seja
 * positivo imprimir a sequência de termos: 0, 1, 3, 6, 10, 15, ...
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int qtd, cont = 0;

		do {
			System.out.print("Insira a quantidade de termos a ser impresso (somente positivos): ");
			qtd = leia.nextInt();

			if (qtd == 0) {
				System.out.println("Fim!");
			} else {
				for (int i = 0; i <= qtd; i++) {
					System.out.print((i + cont) + ", ");
					cont += i;
				}
			}
		} while (qtd < 0);
	}
}
