/*
 * Exercicio12.class
 * 
 * 12) Escreva um programa que conta e exibe a quantidade de vezes que cada vogal ocorre em uma frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		String vogal = "AEIOU";
		int cont = 0;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toUpperCase();

		for (int v = 0; v < vogal.length(); v++) {
			cont = 0;
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == vogal.charAt(v)) {
					cont++;
				}
			}
			System.out.println(vogal.charAt(v) + " - " + cont);
		}

	}
}