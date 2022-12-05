/*
 * Exercicio10.class
 * 
 * 10) Escreva um programa que calcule e escreva a quantidade de letras maiúsculas de uma frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		int cont = 0;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
				cont++;
			}
		}

		System.out.println("A frase possui: " + cont + " letras Maiusculas");

	}
}