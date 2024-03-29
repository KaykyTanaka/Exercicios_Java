/*
 * Exercicio07.java
 * 
 * 7) Escreva um programa para ler uma frase fornecida pelo usuário e contar a quantidade de cada caractere do alfabeto, 
 * imprimindo ao final uma listagem, onde consta o caractere e na frente a quantidade de ocorrências. Caso não tenha 
 * ocorrência apresentar o valor zero. Não diferenciar maiúsculo de minúsculo.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cont = 0;
		String frase;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toUpperCase();

		for (char letra = 'A'; letra <= 'Z'; letra++) {
			cont = 0;
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == letra) {
					cont++;
				}
			}

			System.out.println(letra + " -> " + cont);

		}

	}
}