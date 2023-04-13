/*
 * Exercicio21.class
 * 
 * 21) Escreva um programa que receba uma frase, imprima cada palavras desta frase em uma linha.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		int cont = 0;

		System.out.print("Digite uma palavra: ");
		frase = leia.nextLine();

		String palavra[] = frase.split(" ");

		for (int i = 0; i < palavra.length; i++) {
			System.out.println(palavra[i]);
		}
	}
}
