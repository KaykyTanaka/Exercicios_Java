/*
 * Exercicio13.class
 * 
 * 13) Escreva um programa que imprima o número de consoantes de uma frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		String consoante = "BCDFGHJKLMNPQRSTVWXYZ";
		int cont = 0;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toUpperCase();

		for (int c = 0; c < consoante.length(); c++) {
			for (int i = 0; i < frase.length(); i++) {
				if (frase.charAt(i) == consoante.charAt(c)) {
					cont++;
				}
			}
		}
		System.out.println("A frase possui: " + cont + " consoantes");
	}
}