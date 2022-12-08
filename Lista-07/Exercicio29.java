/*
 * Exercicio29.class
 * 
 * 29) Escreva um programa que apresente um menu com 3 opções:
 * 1 – Criptografar
 * 2 – Descriptografar
 * 3 – Sair
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);

		int opc;
		String frase = "";
		String saida = "";

		do {

			System.out.print("1 - Criptografar\n2- Descriptografar\n3- Sair\nDigite uma opcao: ");
			opc = leia.nextInt();

			if (opc == 1 || opc == 2) {
				System.out.print("Entre com uma frase: ");
				frase = leiaStr.nextLine();

				String zenit = "zenitpolarZENITPOLAR";
				String polar = "polarzenitPOLARZENIT";

				boolean x = false;

				for (int f = 0; f < frase.length(); f++) {
					x = false;
					for (int z = 0; z < zenit.length(); z++) {
						if (frase.charAt(f) == zenit.charAt(z)) {
							saida += polar.charAt(z);
							x = true;
						}
					}

					if (!x) {
						saida += frase.charAt(f);
					}
				}

				System.out.println("Saida: " + saida + "\n");
			}
		} while (opc != 3);
		System.out.println("Encerrado!");
	}
}
