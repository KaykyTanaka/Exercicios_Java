/*
 * Exercicio11.class
 * 
 * 11) Escreva um programa que conte e exiba, separadamente, a quantidade de caracteres alfabéticos e de dígitos numéricos 
 * existentes em uma frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		int contN = 0, cont = 0;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine().toUpperCase();

		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
				cont++;
			}
			if (frase.charAt(i) >= '0' && frase.charAt(i) <= '1') {
				contN++;
			}
		}

		System.out.println("A frase possui: " + cont + " Letras e " + contN + " numeros ");

	}
}