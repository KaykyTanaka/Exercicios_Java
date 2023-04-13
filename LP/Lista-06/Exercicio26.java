/*
 * Exercicio26.java
 * 
 * 26) Escreva um programa em Java que imprima sequência 2:
 * 1, 1
 * 2, 1 2
 * 3, 1 2 3
 * 4, 1 2 3 4
 * 5, 1 2 3 4 5
 * 6, 1 2 3 4 5 6
 * 7, 1 2 3 4 5 6 7
 * 8, 1 2 3 4 5 6 7 8
 * 9, 1 2 3 4 5 6 7 8 9
 * 10, 1 2 3 4 5 6 7 8 9 10
 * 
 */

public class Exercicio26 {

	public static void main(String[] args) {
		int x = 1;
		do {
			System.out.print("\n" + x + ", ");
			for (int i = 1; i <= x; i++) {
				System.out.print(" " + i);
			}

			x++;
		} while (x <= 10);

	}
}
