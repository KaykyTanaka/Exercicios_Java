/*
 * Exercicio25.java
 * 
 * 25) Escreva um programa em Java que imprima sequência 1:
 *  1, 1 2 3 4 5 6 7 8 9 10
 *  2, 1 2 3 4 5 6 7 8 9 10
 *  3, 1 2 3 4 5 6 7 8 9 10
 *  4, 1 2 3 4 5 6 7 8 9 10
 *  5, 1 2 3 4 5 6 7 8 9 10
 *  6, 1 2 3 4 5 6 7 8 9 10
 *  7, 1 2 3 4 5 6 7 8 9 10
 *  8, 1 2 3 4 5 6 7 8 9 10
 *  9, 1 2 3 4 5 6 7 8 9 10
 * 10, 1 2 3 4 5 6 7 8 9 10
 * 
 * 
 */

public class Exercicio25 {

	public static void main(String[] args) {
		int x = 1;
		do {
			System.out.print("\n" + x + ", ");
			for (int i = 0; i <= 10; i++) {
				System.out.print(" " + i);
			}
			x++;

		} while (x <= 10);

	}
}
