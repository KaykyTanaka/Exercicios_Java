/*
 * Exercicio09.class
 * 
 * 9) Fazer um programa para contar quantos espaços em branco existem em uma frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		int cont = 0;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				cont++;
			}
		}

		System.out.println("A frase possui: " + cont + " espacos em branco");

	}
}