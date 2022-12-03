/*
 * Exercicio30.java
 * 
 * 30) Escreva um programa em Java que imprima sequência 6:
 * 1, 1
 * 2, 2 4
 * 3, 1 3 5
 * 4, 2 4 6 8
 * 5, 1 3 5 7 9
 * 6, 2 4 6 8 10 12
 * 7, 1 3 5 7 9 11 13
 * 8, 2 4 6 8 10 12 14 16
 * 9, 1 3 5 7 9 11 13 15 17
 * 10, 2 4 6 8 10 12 14 16 18 20
 * 
 * 
 */

public class Exercicio30 {

	public static void main(String[] args) {
		int x = 1;

		do {
			System.out.print(x + ",");
			for (int i = 1; i <= x * 2; i++) {
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
