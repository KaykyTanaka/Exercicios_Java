/*
 * Exercicio05.java
 * 
 * 5) Escreva um programa que calcule e escreva a quantidade de vezes que o caractere 'a' aparece 
 * em uma frase fornecida pelo usuário. Nota Importante: para a contagem, o caractere pode ser maiúsculo ou minúsculo.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int cont = 0;
		String frase;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
				cont++;
			}
		}
		System.out.println("A frase: " + frase + "\nPossui " + cont + " caracteres 'a'");
	}
}