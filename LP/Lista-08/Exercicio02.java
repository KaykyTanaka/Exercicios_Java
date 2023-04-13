/*
 * Exercicio02.class
 * 
 * 2) Escreva um programa para ler um vetor B de 15 posições e imprimir em ordem invertida.
 * 
 * 
 */

public class Exercicio02 {

	public static void main(String[] args) {

		int a[];
		a = new int[15];

		for (int i = 0; i < a.length; i++) {

			a[i] = (char) ((Math.random() * 26) + 'a');
			System.out.print(a[i] + "|");

		}

		System.out.println("\n====Inverso====");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + "|");
		}

	}
}
