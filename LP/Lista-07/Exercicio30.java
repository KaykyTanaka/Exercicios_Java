/*
 * Exercicio30.class
 * 
 * 30) Da mesma forma que o exercício anterior, implemente um programa para criptografar e
 * descriptografar utilizando a cifra ROT-13.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);

		int opc = 0;
		String frase = "";
		String saida = "";

		do {

			System.out.print("1 - Criptografar\n2- Descriptografar\n3- Sair\nDigite uma opcao: ");
			opc = leia.nextInt();

			if (opc == 1 || opc == 2) {
				System.out.print("Entre com uma frase: ");
				frase = leiaStr.nextLine().toLowerCase();
				saida = "";
				for (int f = 0; f < frase.length(); f++) {
					if (frase.charAt(f) >= 'a' && frase.charAt(f) <= 'm') {
						saida += (char) (frase.charAt(f) + 13);
					} else {
						if (frase.charAt(f) >= 'n' && frase.charAt(f) <= 'z') {
							saida += (char) (frase.charAt(f) - 13);
						} else {
							saida += frase.charAt(f);
						}
					}
				}
				System.out.println("Saida: " + saida + "\n");
			}
		} while (opc != 3);

		System.out.println("Encerrado!");

	}
}
