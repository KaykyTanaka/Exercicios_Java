/*
 * Exercicio42.java
 * 
 * 42) Construa um programa para mostrar o fatorial dos números inteiros na faixa de 1 a 10
 * 
 * 
 */

public class Exercicio42 {

	public static void main(String[] args) {

		int x = 1;
		int total = 1;

		do {
			System.out.print("\n" + x + "! = ");
			total = 1;
			for (int i = 1; i <= x; i++) {
				System.out.print(i + "*");
				total *= i;
			}
			System.out.print("\b = " + total);
			x++;
		} while (x <= 10);
	}
}