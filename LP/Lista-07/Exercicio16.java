/*
 * Exercicio16.class
 * 
 * 16) Escreva um programa que informe se todos os caracteres alfabéticos de uma frase fornecida pelo usuário são maiúsculos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		int cont = 0;

		System.out.print("Digite uma frase: ");
		frase = leia.nextLine();

		for (int j = 0; j < frase.length(); j++) {
			if (frase.charAt(j) >= 'a' && frase.charAt(j) <= 'z') {
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("Todos os caracteres alfabeticos sao maiusculos!");
		} else {
			System.out.println("A frase nao contem todos os caracteres alfabeticos maiusculos");
		}
	}
}