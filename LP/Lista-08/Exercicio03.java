/*
 * Exercicio03.class
 * 
 * 3) Escreva um programa para ler um vetor C de N posições, onde N é menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o número de posições e os elementos.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		int x = 0;
		System.out.print("Digite o numero de posicoes do vetor (entre 0 e 20):");
		int n = leia.nextInt();
		String c[];

		if (n >= 0 && n <= 20) {
			c = new String[n];

			do {
				System.out.print("Digite um elemento:");
				c[x] = leiaStr.nextLine();
				x++;
			} while (x < n);

			for (int i = 0; i < c.length; i++) {
				System.out.print(c[i] + " | ");
			}

		} else {
			System.out.print("Numero invalido!");
		}

	}
}
