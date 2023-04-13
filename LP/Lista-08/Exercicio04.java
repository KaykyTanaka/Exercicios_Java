/*
 * Exercicio04.class
 * 
 * 4) Escreva um programa para ler um vetor D de N posições, onde N é menor ou igual a 20 e imprimir seus elementos. O 
 * usuário deve informar o número de posições e os elementos. O programa deve validar a quantidade de posições, não 
 * permitindo que o usuário forneça um valor inválido.
 * 
 * 
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		int x = 0;
		System.out.print("Digite o numero de posicoes do vetor (entre 0 e 20):");
		int n = leia.nextInt();
		String d[];

		if (n >= 0 && n <= 20) {
			d = new String[n];

			do {
				System.out.print("Digite um elemento:");
				d[x] = leiaStr.nextLine();
				x++;
			} while (x < n);

			for (int i = 0; i < d.length; i++) {
				System.out.print(d[i] + " | ");
			}

		} else {
			System.out.print("Valor invalido!");
		}

	}
}
