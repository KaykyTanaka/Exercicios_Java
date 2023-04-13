/*
 * Exercicio28.java
 * 
 * 28) Escreva um programa em Java que imprima sequência 4:
 * 1, 2 3 4 5 6 7 8 9 10
 * 2, 3 4 5 6 7 8 9 10
 * 3, 4 5 6 7 8 9 10
 * 4, 5 6 7 8 9 10
 * 5, 6 7 8 9 10
 * 6, 7 8 9 10
 * 7, 8 9 10
 * 8, 9 10
 * 9, 10
 * 10,
 * 
 */

public class Exercicio28 {

	public static void main(String[] args) {
		int x = 1;
		do {
			System.out.print(x + ", ");
			for (int i = x + 1; i <= 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			x++;
		} while (x <= 10);
	}
}
