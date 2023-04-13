/*
 * Exercicio29.java
 * 
 * 29) Escreva um programa em Java que imprima sequência 5:
 * 1, 1 3 5 7 9
 * 2, 2 4 6 8 10
 * 3, 1 3 5 7 9
 * 4, 2 4 6 8 10
 * 5, 1 3 5 7 9
 * 6, 2 4 6 8 10
 * 7, 1 3 5 7 9
 * 8, 2 4 6 8 10
 * 9, 1 3 5 7 9
 * 10, 2 4 6 8 10
 * 
 * 
 */

public class Exercicio29 {

	public static void main(String[] args) {
		int x = 1;

		do {
			System.out.print(x + ",");
			for (int i = 1; i <= 10; i++) {
				if (x % 2 != 0) {
					if (i % 2 != 0) {
						System.out.print(" " + i);
					}

				} else {
					if (i % 2 == 0) {
						System.out.print(" " + i);
					}
				}
			}
			System.out.println();
			x++;
		} while (x <= 10);
	}
}
