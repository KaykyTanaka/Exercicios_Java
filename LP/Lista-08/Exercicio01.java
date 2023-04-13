/*
 * Exercicio01.class
 * 
 * 1) Escreva um programa para ler um vetor A de 15 posições e imprimir seus elementos.
 * 
 * 
 */

public class Exercicio01 {

	public static void main(String[] args) {

		int a[];
		a = new int[15];

		for (int i = 0; i < a.length; i++) {

			a[i] = (char) ((Math.random() * 26) + 'a');

			System.out.println(i + "-> " + a[i] + " ");
		}

	}
}
