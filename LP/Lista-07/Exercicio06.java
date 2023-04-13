/*
 * Exercicio06.java
 * 
 * 6) Escreva um programa que calcule e escreva a quantidade de vezes que um caractere fornecido pelo usuário aparece em uma
 * frase, também, fornecida pelo mesmo. Nota Importante: para a contagem, o caractere pode ser maiúsculo ou minúsculo.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cont = 0;
		String frase, caractere;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine();
		System.out.print("Digite um caractere: ");
		caractere = leia.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			if (frase.toUpperCase().charAt(i) == caractere.toUpperCase().charAt(0)) {
				cont++;
			}
		}

		System.out.println("A frase: " + frase + "\nPossui " + cont + " caracteres " + caractere);

	}
}